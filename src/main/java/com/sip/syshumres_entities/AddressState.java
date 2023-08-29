package com.sip.syshumres_entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de estados de la Republica
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="addresses_states")
public class AddressState extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "AddressState" + super.toString();
	}

}
