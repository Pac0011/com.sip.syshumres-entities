package com.sip.syshumres_entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo para Tipo de recurso (Facturado o No Facturado)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="invoiced_resource_types")
public class InvoicedResourceType extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "InvoicedResourceType " + super.toString();
	}

}
