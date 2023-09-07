package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de numero de dosis vacunacion
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="vaccine_dose")
public class VaccineDose extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "VaccineDose " + super.toString();
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
		
		if (!(obj instanceof VaccineDose)) {
			return false;
		}
		VaccineDose s = (VaccineDose) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
