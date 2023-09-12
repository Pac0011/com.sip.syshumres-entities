package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de estatus de movimientos del IMSS
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="imss_movement_status")
public class ImssMovementStatus extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "ImssMovementStatus " + super.toString();
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
		
		if (!(obj instanceof ImssMovementStatus)) {
			return false;
		}
		ImssMovementStatus s = (ImssMovementStatus) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
