package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.HiringDocuments;

/**
 * Clase DTO. Forma para documentos de empleados
 * 
 * @author Prong
 * @version 2.0
 */
public class EmployeeDocumentDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6436771854094960816L;

	private Long id;
    
    @JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
    private HiringDocuments hiringDocuments;
    
    private String document;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HiringDocuments getHiringDocuments() {
		return hiringDocuments;
	}

	public void setHiringDocuments(HiringDocuments hiringDocuments) {
		this.hiringDocuments = hiringDocuments;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDocumentDTO other = (EmployeeDocumentDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeDocumentDTO [id=" + id + ", hiringDocuments=" + hiringDocuments + ", document=" + document
				+ "]";
	}
	
}
