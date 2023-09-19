package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogos de grados escolares
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="school_grades")
@NoArgsConstructor
@ToString
public class SchoolGrade extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof SchoolGrade)) {
			return false;
		}
		SchoolGrade s = (SchoolGrade) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
