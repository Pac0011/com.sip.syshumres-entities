package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de evaluaciones para prospectos
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="evaluations")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Evaluation extends BaseEntityCatalog {
	
	@Size(
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String name;
	
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
