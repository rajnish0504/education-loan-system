package com.els.educationloansystem.service.impl;

import com.els.educationloansystem.dto.DocumentDto;
import com.els.educationloansystem.entity.Document;
import com.els.educationloansystem.entity.LoanApplication;
import com.els.educationloansystem.repository.DocumentRepository;
import com.els.educationloansystem.repository.LoanApplicationRepository;
import com.els.educationloansystem.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepository documentRepo;

	@Autowired
	private LoanApplicationRepository applicationRepo;

	@Override
	public Document uploadDocument(DocumentDto dto) {

		LoanApplication application = applicationRepo.findById(dto.getApplicationId())
				.orElseThrow(() -> new RuntimeException("Application not found"));

		// ⚠ for now store only filename (later S3 / Cloudinary)
		String fileUrl = dto.getFile().getOriginalFilename();

		Document document = new Document();
		document.setDocumentType(dto.getDocumentType());
		document.setDocumentUrl(fileUrl);
		document.setUploadedDate(LocalDate.now());
		document.setVerificationStatus("PENDING");
		document.setLoanApplication(application);

		return documentRepo.save(document);
	}

	@Override
	public List<Document> getDocumentsByApplication(Long applicationId) {
		return documentRepo.findByLoanApplication_ApplicationId(applicationId);
	}

	@Override
	public void verifyDocument(Long documentId, String status) {

		Document document = documentRepo.findById(documentId)
				.orElseThrow(() -> new RuntimeException("Document not found"));

		document.setVerificationStatus(status);
		documentRepo.save(document);
	}
}
