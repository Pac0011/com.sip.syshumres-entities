package com.sip.syshumres_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.validation.constraints.DecimalMax;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

/**
 * Clase Entity. Catalogo de menus para comedor
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="dinning_room")
public class DinningRoom extends BaseEntityCatalog {
	
	public DinningRoom() {}
	
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
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DinningRoom " + super.toString();
	}

}
