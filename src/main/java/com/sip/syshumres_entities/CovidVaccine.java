package com.sip.syshumres_entities;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de marcas de vacunas covid
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="covid_vaccines")
@NoArgsConstructor
@ToString
public class CovidVaccine extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof CovidVaccine)) {
			return false;
		}
		CovidVaccine s = (CovidVaccine) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
