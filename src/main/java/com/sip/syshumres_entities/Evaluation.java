package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.common.BaseEntityCatalog;


/**
 * Clase Entity. Registro de evaluaciones para prospectos
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="evaluations")
public class Evaluation extends BaseEntityCatalog {
	
	@Size(
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Evaluation" + super.toString();
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
		
		if (!(obj instanceof Evaluation)) {
			return false;
		}
		Evaluation s = (Evaluation) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
