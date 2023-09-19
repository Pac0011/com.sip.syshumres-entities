package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de estados de la Republica
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="addresses_states")
@NoArgsConstructor
@ToString
public class AddressState extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof AddressState)) {
			return false;
		}
		AddressState s = (AddressState) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
