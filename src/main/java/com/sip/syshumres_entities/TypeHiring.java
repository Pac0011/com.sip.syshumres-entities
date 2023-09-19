package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de tipos de contratación (Outsourcing, Directo(Empresa))
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="type_hiring")
@NoArgsConstructor
@ToString
public class TypeHiring extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof TypeHiring)) {
			return false;
		}
		TypeHiring s = (TypeHiring) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
}
