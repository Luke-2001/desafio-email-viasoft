package com.viasoft.email_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {

    @Email
    @NotBlank
    private String emailDestinatario;

    @NotBlank
    private String nomeDestinatario;

    @Email
    @NotBlank
    private String emailRemetente;

    @NotBlank
    private String assunto;

    @NotBlank
    private String conteudo;
}
