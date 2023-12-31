package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de turnos (8X16, 12x12, etc)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="turns")
@NoArgsConstructor
@ToString
public class Turn extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Turn)) {
			return false;
		}
		Turn s = (Turn) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
