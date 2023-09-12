package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de parentesco empleado
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="relationship_person")
public class RelationshipPerson extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "RelationshipPerson " + super.toString();
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
		
		if (!(obj instanceof RelationshipPerson)) {
			return false;
		}
		RelationshipPerson s = (RelationshipPerson) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
