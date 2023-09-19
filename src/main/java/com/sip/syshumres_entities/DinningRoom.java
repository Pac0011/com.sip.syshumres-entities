package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.validation.constraints.DecimalMax;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Catalogo de menus para comedor
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="dinning_room")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DinningRoom extends BaseEntityCatalog {
	
	public DinningRoom(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
	@DecimalMax(
	  value = "500",
	  message = "de precio no debe ser mayor a ${value}"
	)
	@Column(columnDefinition = "float default 0")
	private float price;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof DinningRoom)) {
			return false;
		}
		DinningRoom s = (DinningRoom) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
