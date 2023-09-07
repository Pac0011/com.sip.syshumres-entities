package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de vigencias de licencias
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="driver_license_validity")
public class DriverLicenseValidity extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "DriverLicenseValidity " + super.toString();
	}

}
