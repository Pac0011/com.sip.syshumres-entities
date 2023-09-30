package com.sip.syshumres_entities.common;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase. Entity comun para Datos de contacto
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
@Getter
@Setter
public class BaseContactInfo extends BaseEntityCatalog {
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Size(
		max=6,
		message = "Extensión de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "ext_phone_number")
	private String extPhoneNumber;
	
	@Size(
		max=6,
		message = "Corto de número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "short_phone_number")
	private String shortPhoneNumber;
	
	@Transient
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
