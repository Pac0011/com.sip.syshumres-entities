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
 * Clase Entity. Registro de direcciones ubicacion y fiscal para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_addresses")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeAddress extends BaseAddress {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeAddress)) {
			return false;
		}
		EmployeeAddress s = (EmployeeAddress) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
