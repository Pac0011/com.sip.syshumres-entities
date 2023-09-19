package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de tipo de nominas (Semanal, Quincenal, Especial, etc)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="payroll_types")
@NoArgsConstructor
@ToString
public class PayrollType extends BaseEntityCatalog {
		
	public PayrollType(Long id, String description, boolean enabled) {
		this.setId(id);
		this.setDescription(description);
		this.setEnabled(enabled);
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
		
		if (!(obj instanceof PayrollType)) {
			return false;
		}
		PayrollType s = (PayrollType) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
