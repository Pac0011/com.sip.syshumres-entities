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
 * Clase DTO. Forma para Sucursales
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BranchOfficeDTO extends BaseEntityCatalogDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1799527185250030060L;
	
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
	
	private EntitySelectDTO branchOfficeType;
	
	private EntitySelectDTO costCenter;
	
	private EntitySelectDTO region;
	
	private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private AddressDTO address;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BranchOfficeDTO other = (BranchOfficeDTO) obj;
		return this.getId().equals(other.getId());
	}
	
}
