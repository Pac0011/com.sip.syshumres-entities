package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de termino de grados escolares
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="school_grades_complete")
@NoArgsConstructor
@ToString
public class SchoolGradeComplete extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof SchoolGradeComplete)) {
			return false;
		}
		SchoolGradeComplete s = (SchoolGradeComplete) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
