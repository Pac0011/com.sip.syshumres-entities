package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de factor de descuento Infonavit (Porcentaje, Veces salario mínimo, Cuota fija)
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="factors_discount_infonavit")
@NoArgsConstructor
@ToString
public class FactorDiscountInfonavit extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof FactorDiscountInfonavit)) {
			return false;
		}
		FactorDiscountInfonavit s = (FactorDiscountInfonavit) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
