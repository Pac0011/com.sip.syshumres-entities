package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de tipos de plantillas para (Servicios, Administrativos Sucursal, Comodines, CubreVacaciones, Especiales)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="types_staff")
public class TypeStaff extends BaseEntityCatalog {
	
	@Override
	public String toString() {
		return "TypeStaff" + super.toString();
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
		
		if (!(obj instanceof TypeStaff)) {
			return false;
		}
		TypeStaff s = (TypeStaff) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
