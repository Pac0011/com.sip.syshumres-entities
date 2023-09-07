package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de genero
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="genders")
public class Gender extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "Gender " + super.toString();
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
		
		if (!(obj instanceof Gender)) {
			return false;
		}
		Gender s = (Gender) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
