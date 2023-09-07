package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de tipos de licencia
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="driver_license_types")
public class DriverLicenseType extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "DriverLicenseType " + super.toString();
	}

}
