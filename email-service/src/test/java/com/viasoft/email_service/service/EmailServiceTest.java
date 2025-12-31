package com.viasoft.email_service.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.viasoft.email_service.dto.EmailDTO;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

    @InjectMocks
    @Spy
    private EmailService emailService;

    @Test
    void sendEmailAwsTest() {

        EmailDTO emailDTO = getEmailDTO();

        emailService.sendEmail(emailDTO, "AWS");

        verify(emailService).emailAws(emailDTO);
        verify(emailService, never()).emailOci(any());
    }

    @Test
    void sendEmailOciTest() {

        EmailDTO emailDTO = getEmailDTO();

        emailService.sendEmail(emailDTO, "OCI");

        verify(emailService).emailOci(emailDTO);
        verify(emailService, never()).emailAws(any());
    }

    @Test
    void sendEmailExceptionTest() {

        EmailDTO emailDTO = getEmailDTO();

        assertThrows(IllegalArgumentException.class, () -> emailService.sendEmail(emailDTO, ""));

        verify(emailService, never()).emailAws(any());
        verify(emailService, never()).emailOci(any());
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
