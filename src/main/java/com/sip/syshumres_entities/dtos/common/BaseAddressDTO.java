package com.sip.syshumres_entities.dtos.common;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseAddressDTO {
	
    private Long id;
	
	@Size(
        max=5,
        message = "Código postal debe tener una longitud máxima de {max} carácteres"
    )
	private String zip;
	
	private EntitySelectDTO addressState;
	
	@Size(
		max=64,
		message = "Ciudad debe tener una longitud máxima de {max} carácteres"
	)
	private String city;
	
	@Size(
		max=64,
		message = "Municipio debe tener una longitud máxima de {max} carácteres"
	)
	private String municipality;
	
	@Size(
		max=64,
		message = "Colonia debe tener una longitud máxima de {max} carácteres"
	)
	private String colony;
	
	@Size(
		max=64,
		message = "Calle debe tener una longitud máxima de {max} carácteres"
	)
	private String street;
	
	@Size(
		max=12,
		message = "Número debe tener una longitud máxima de {max} carácteres"
	)
	private String number;
	
	@Size(
		max=12,
		message = "Número debe tener una longitud máxima de {max} carácteres"
	)
	private String numberInterior;

}
