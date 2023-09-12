package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de tipos de movimientos del IMSS (Alta, Baja, Alta-Baja, Ninguno)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="imss_movement_types")
public class ImssMovementType extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "ImssMovementType " + super.toString();
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
		
		if (!(obj instanceof ImssMovementType)) {
			return false;
		}
		ImssMovementType s = (ImssMovementType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}