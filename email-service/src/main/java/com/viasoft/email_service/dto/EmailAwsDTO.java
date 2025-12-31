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
public class EmailAwsDTO {

    @Size(max = 45)
    private String recipient;

    @Size(max = 60)
    private String recipientName;

    @Size(max = 45)
    private String sender;

    @Size(max = 120)
    private String subject;

    @Size(max = 256)
    private String content;
}
