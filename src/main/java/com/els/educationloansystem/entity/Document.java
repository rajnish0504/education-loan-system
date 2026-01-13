package com.els.educationloansystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long documentId;

	private String documentType;          // Aadhaar, PAN, Admission Letter
	private String documentUrl;           // file path or cloud url
	private LocalDate uploadedDate;

	private String verificationStatus;    // PENDING / VERIFIED / REJECTED

	@ManyToOne
	@JoinColumn(name = "application_id")
	private LoanApplication loanApplication;
}

