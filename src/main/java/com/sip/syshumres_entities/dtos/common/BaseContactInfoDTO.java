package com.sip.syshumres_entities.dtos.common;

import java.util.Optional;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseContactInfoDTO extends BaseEntityCatalogDTO {
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	private String phoneNumber;
	
	@Size(
		max=6,
		message = "Extensión de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	private String extPhoneNumber;
	
	@Size(
		max=6,
		message = "Corto de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	private String shortPhoneNumber;
	
	public String getFullPhoneNumber() {
		return new StringBuilder(Optional.ofNullable(this.phoneNumber).orElse(""))
				.append(" Ext.: ")
				.append(Optional.ofNullable(this.extPhoneNumber).orElse("")).toString();
	}
		
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;

}
