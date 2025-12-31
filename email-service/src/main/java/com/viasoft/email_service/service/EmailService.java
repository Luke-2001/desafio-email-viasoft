package com.viasoft.email_service.service;

import org.springframework.stereotype.Service;

import com.viasoft.email_service.dto.EmailAwsDTO;
import com.viasoft.email_service.dto.EmailDTO;
import com.viasoft.email_service.dto.EmailOciDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class EmailService {

    public void sendEmail(EmailDTO emailDTO, String integracao) {

        if (integracao.equals("AWS")) {

            emailAws(emailDTO);
            return;

        } else if (integracao.equals("OCI")) {

            emailOci(emailDTO);

            return;
        }

        throw new IllegalArgumentException("Integração de email inválida: " + integracao);
    }

    public void emailOci(EmailDTO emailDTO) {

        EmailOciDTO emailOciDTO = new EmailOciDTO();

        emailOciDTO.setRecipientEmail(emailDTO.getEmailDestinatario());
        emailOciDTO.setRecipientName(emailDTO.getNomeDestinatario());
        emailOciDTO.setSenderEmail(emailDTO.getEmailRemetente());
        emailOciDTO.setSubject(emailDTO.getAssunto());
        emailOciDTO.setBody(emailDTO.getConteudo());

        log.info("Enviando email via OCI {}", emailOciDTO);
    }

    public void emailAws(EmailDTO emailDTO) {

        EmailAwsDTO emailAwsDTO = new EmailAwsDTO();

        emailAwsDTO.setRecipient(emailDTO.getEmailDestinatario());
        emailAwsDTO.setRecipientName(emailDTO.getNomeDestinatario());
        emailAwsDTO.setSender(emailDTO.getEmailRemetente());
        emailAwsDTO.setSubject(emailDTO.getAssunto());
        emailAwsDTO.setContent(emailDTO.getConteudo());

        log.info("Enviando email via AWS {}", emailAwsDTO);
    }
}
