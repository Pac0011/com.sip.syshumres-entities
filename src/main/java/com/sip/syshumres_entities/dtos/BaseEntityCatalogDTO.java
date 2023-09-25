package com.sip.syshumres_entities.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class BaseEntityCatalogDTO {
	
	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
    private String description;
	
	private boolean enabled;

}
