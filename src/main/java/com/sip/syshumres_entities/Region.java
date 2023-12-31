package com.sip.syshumres_entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de regiones de Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="regions")
@NoArgsConstructor
@ToString
public class Region extends BaseEntityCatalog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6660600268094676176L;

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Region)) {
			return false;
		}
		Region s = (Region) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
