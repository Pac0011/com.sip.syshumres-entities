package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para Administradoras
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ManagingCompanyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -393488541872429673L;

	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
	private String description;
	
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
	
	private String fullPhoneNumber;
	
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;
	
	@NotEmpty
	@Size(
		min=1,
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String companyName;
	
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String rfc;
	
	@NotEmpty
	@Size(
		min=1,
		max=13,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String employerRegistration;
	
	@NotEmpty
	@Size(
		min=1,
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String legalRepresentative;
	
	private EntitySelectDTO typeHiring;
		
	private boolean enabled;
	
	private List<EntitySelectDTO> branchOffices;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private AddressDTO address;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private AddressDTO addressFiscal;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManagingCompanyDTO other = (ManagingCompanyDTO) obj;
		return id.equals(other.id);
	}
	
}
