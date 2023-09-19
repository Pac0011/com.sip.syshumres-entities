package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de estatus de empleado(Contratado, Baja)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_status")
@NoArgsConstructor
@ToString
public class EmployeeStatus extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeStatus)) {
			return false;
		}
		EmployeeStatus s = (EmployeeStatus) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
