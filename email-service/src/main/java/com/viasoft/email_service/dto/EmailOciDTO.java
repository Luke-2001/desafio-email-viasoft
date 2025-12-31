package com.viasoft.email_service.dto;

import jakarta.validation.constraints.Size;
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
public class EmailOciDTO {

    @Size(max = 40)
    private String recipientEmail;

    @Size(max = 50)
    private String recipientName;

    @Size(max = 40)
    private String senderEmail;

    @Size(max = 100)
    private String subject;

    @Size(max = 250)
    private String body;
}
