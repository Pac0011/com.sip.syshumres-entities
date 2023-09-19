package com.sip.syshumres_entities;

import java.util.Objects;

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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de documentos para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_documents")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeDocument extends BaseEntityLog {
	
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
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
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
