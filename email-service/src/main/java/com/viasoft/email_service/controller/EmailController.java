package com.viasoft.email_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viasoft.email_service.dto.EmailDTO;
import com.viasoft.email_service.service.EmailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {

        this.emailService = emailService;
    }

    @PostMapping
    public Object sendEmail(@Valid @RequestBody EmailDTO emailDTO, @RequestParam(name = "mail.integracao") String integracao) {

        emailService.sendEmail(emailDTO, integracao);

        return ResponseEntity.noContent().build();

    }
}
