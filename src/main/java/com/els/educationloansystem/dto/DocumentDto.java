package com.els.educationloansystem.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class DocumentDto {

    private Long applicationId;
    private String documentType;
    private MultipartFile file;
}
