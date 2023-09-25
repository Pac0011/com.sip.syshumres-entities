package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;


/**
 * Clase Entity. Catalogo de catagorias de documentos para contratación (Proceso de seleccion, Documentos personales, Kit de contratacion)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="hiring_documents_type")
@NoArgsConstructor
public class HiringDocumentsType extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		//Se utiliza este para que el model.mapper solo le agregue la description  al DTO
		return super.getDescription();
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
		
		if (!(obj instanceof HiringDocumentsType)) {
			return false;
		}
		HiringDocumentsType s = (HiringDocumentsType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
