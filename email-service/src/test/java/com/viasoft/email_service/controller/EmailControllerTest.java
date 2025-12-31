package com.viasoft.email_service.controller;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.viasoft.email_service.dto.EmailDTO;
import com.viasoft.email_service.service.EmailService;

@ExtendWith(MockitoExtension.class)
class EmailControllerTest {

    @InjectMocks
    private EmailController emailController;

    @Mock
    private EmailService emailService;

    @Test
    void sendEmailSuccess() {

        EmailDTO emailDTO = getEmailDTO();

        emailController.sendEmail(emailDTO, "AWS");
        verify(emailService).sendEmail(emailDTO, "AWS");
    }

    private EmailDTO getEmailDTO() {

        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setEmailDestinatario("email");
        emailDTO.setNomeDestinatario("nome");
        emailDTO.setEmailRemetente("remetente");
        emailDTO.setAssunto("assunto");
        emailDTO.setConteudo("conteudo");

        return emailDTO;
    }
}
