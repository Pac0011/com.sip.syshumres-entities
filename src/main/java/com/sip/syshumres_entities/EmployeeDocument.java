package com.sip.syshumres_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;


/**
 * Clase Entity. Registro de documentos para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_documents")
public class EmployeeDocument extends BaseEntityLog {
	
	public EmployeeDocument() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_profile_id")
	private EmployeeProfile employeeProfile;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="hiring_documents_id")
	private HiringDocuments hiringDocuments;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "document")
	private String document;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public EmployeeProfile getEmployeeProfile() {
		return employeeProfile;
	}

	public void setEmployeeProfile(EmployeeProfile employeeProfile) {
		this.employeeProfile = employeeProfile;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeDocument)) {
			return false;
		}
		EmployeeDocument s = (EmployeeDocument) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

}
