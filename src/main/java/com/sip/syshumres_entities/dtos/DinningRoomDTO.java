package com.sip.syshumres_entities.dtos;

import java.io.Serializable;

import javax.validation.constraints.DecimalMax;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO.
 * 
 * @author Prong
 * @version 2.0
 */
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DinningRoomDTO extends BaseEntityCatalogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5891957375160889115L;
	
	@DecimalMax(
	  value = "500",
	  message = "de precio no debe ser mayor a ${value}"
	)
	private float price;

}
