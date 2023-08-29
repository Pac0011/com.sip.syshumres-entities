package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de regiones de Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="regions")
public class Region extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "Region" + super.toString();
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
		
		if (!(obj instanceof Region)) {
			return false;
		}
		Region s = (Region) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
