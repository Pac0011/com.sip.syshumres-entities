package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. para direcciones empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeAddressDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4371084201416694020L;

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
		EmployeeAddressDTO other = (EmployeeAddressDTO) obj;
		return id.equals(other.id);
	}

}
