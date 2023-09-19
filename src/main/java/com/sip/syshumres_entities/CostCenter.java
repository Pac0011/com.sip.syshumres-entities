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
 * Clase Entity. Catalogo de centros de costos para Sucursales y Areas
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="cost_centers")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CostCenter extends BaseEntityCatalog {
		
	@Size(
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String code;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof CostCenter)) {
			return false;
		}
		CostCenter s = (CostCenter) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
