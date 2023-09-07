package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de marcas de vacunas covid
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="covid_vaccines")
public class CovidVaccine extends BaseEntityCatalog {
	
	public CovidVaccine() {}
	
	@Override
	public String toString() {
		return "CovidVaccines " + super.toString();
	}

}
