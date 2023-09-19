package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de vigencias de licencias
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="driver_license_validity")
@NoArgsConstructor
@ToString
public class DriverLicenseValidity extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof DriverLicenseValidity)) {
			return false;
		}
		DriverLicenseValidity s = (DriverLicenseValidity) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
