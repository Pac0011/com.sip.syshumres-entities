package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de tipos de sangre
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="blood_type")
public class BloodType extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "BloodType" + super.toString();
	}

}
