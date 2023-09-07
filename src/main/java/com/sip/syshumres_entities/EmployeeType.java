package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Catalogo de tipo de empleado (Administrativo u Operativo)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_types")
public class EmployeeType extends BaseEntityCatalog {
	
	//GU- o AD-
	@NotEmpty
	@Size(
		min=1,
		max=3,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "prefix")
	private String prefix;
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public String toString() {
		return "EmployeeType " + super.toString() + " [prefix=" + prefix + "]";
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
		
		if (!(obj instanceof EmployeeType)) {
			return false;
		}
		EmployeeType s = (EmployeeType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
