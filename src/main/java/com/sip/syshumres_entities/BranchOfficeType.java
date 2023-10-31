package com.sip.syshumres_entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de tipo de Sucursales(SUC, OOP)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="branch_offices_types")
@NoArgsConstructor
@ToString
public class BranchOfficeType extends BaseEntityCatalog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7826891173154787865L;

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof BranchOfficeType)) {
			return false;
		}
		BranchOfficeType s = (BranchOfficeType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
