package com.els.educationloansystem.service;

import com.els.educationloansystem.dto.DocumentDto;
import com.els.educationloansystem.entity.Document;

import java.util.List;

public interface DocumentService {

	Document uploadDocument(DocumentDto dto);

	List<Document> getDocumentsByApplication(Long applicationId);

	void verifyDocument(Long documentId, String status);
}
