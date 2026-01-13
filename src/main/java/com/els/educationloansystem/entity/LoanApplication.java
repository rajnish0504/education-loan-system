package com.els.educationloansystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class LoanApplication {

    @OneToMany(mappedBy = "loanApplication", cascade = CascadeType.ALL)
    private List<Document> documents;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    private Double loanAmount;
    private String courseName;
    private String instituteName;
    private Integer courseDuration;


    private String eligibilityStatus;   // ELIGIBLE / NOT_ELIGIBLE
    private String applicationStatus;   // PENDING / APPROVED / REJECTED

    private LocalDate applicationDate = LocalDate.now();

    @ManyToOne
    private Student student;
}

