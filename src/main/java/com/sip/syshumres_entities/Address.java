package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseAddress;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Registro de direcciones ubicacion y fiscal para Empresas y Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="addresses")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address extends BaseAddress {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Address)) {
			return false;
		}
		Address s = (Address) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
}
