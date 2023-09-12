/**
 * 
 */
package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de Nacionalidades
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="nationality")
public class Nationality extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "Nationality " + super.toString();
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
		
		if (!(obj instanceof Nationality)) {
			return false;
		}
		Nationality s = (Nationality) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}