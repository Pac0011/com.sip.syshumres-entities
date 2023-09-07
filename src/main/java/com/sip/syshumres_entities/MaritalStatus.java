package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de estatus maritales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="marital_status")
public class MaritalStatus extends BaseEntityCatalog {

	@Override
	public String toString() {
		return "MaritalStatus " + super.toString();
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
		
		if (!(obj instanceof MaritalStatus)) {
			return false;
		}
		MaritalStatus s = (MaritalStatus) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
