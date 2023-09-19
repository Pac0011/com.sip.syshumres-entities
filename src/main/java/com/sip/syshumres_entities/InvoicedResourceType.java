package com.sip.syshumres_entities;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo para Tipo de recurso (Facturado o No Facturado)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="invoiced_resource_types")
@NoArgsConstructor
@ToString
public class InvoicedResourceType extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof InvoicedResourceType)) {
			return false;
		}
		InvoicedResourceType s = (InvoicedResourceType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
