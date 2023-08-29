package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de tipo de Sucursales(SUC, OOP)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="branch_offices_types")
public class BranchOfficeType extends BaseEntityCatalog {
	
	public BranchOfficeType() {}
	
	@Override
	public String toString() {
		return "BranchOfficeType" + super.toString();
	}

}
