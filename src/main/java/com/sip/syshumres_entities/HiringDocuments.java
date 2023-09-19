package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Clase Entity. Catalogo de documentos para contratación (Solicitud de empleo ó C.V., Evaluación psicométrica., Reporte de Antidoping y médico)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="hiring_documents")
@Getter
@Setter
@NoArgsConstructor
public class HiringDocuments extends BaseEntityCatalog {
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="hiring_documents_type_id")
	@NotNull
	private HiringDocumentsType hiringDocumentsType;

	@Override
	public String toString() {
		//return "HiringDocuments" + super.toString() + " [hiringDocumentsType=" + hiringDocumentsType + "]";
		//Se utiliza este para que el model.mapper solo le agregue la description  al DTO
		return super.getId().toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof HiringDocuments)) {
			return false;
		}
		HiringDocuments s = (HiringDocuments) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
