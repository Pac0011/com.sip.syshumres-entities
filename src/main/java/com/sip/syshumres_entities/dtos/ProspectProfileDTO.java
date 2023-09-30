package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Vista para Prospectos
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProspectProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -580277640515731413L;

	private Long id;

	@Size(
		min=12,
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String ecript;
	
	@NotEmpty
	@Size(
		min=17, 
		max=19,
		message = "Curp debe tener una longitud entre {min} y {max} caracteres"
	)
	private String curp;
	
	@Size(
		max = 14,
		message = "Rfc debe tener una longitud maxima de {max} caracteres"
	)
	private String rfc;

	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String firstName;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String lastName;
		
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String lastNameSecond;
	
	private String fullName;
	
	private EntitySelectDTO employeePosition;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;
	
	@Size(
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String phoneNumber;
	
	@Size(
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String cellNumber;
	
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;
	
	private EntitySelectDTO gender;
	
	private EntitySelectDTO prospectStatus;
	
	private EntitySelectDTO branchOffice;
	
	@Size(
		max=32,
		message = "Nacionalidad debe tener una longitud máxima de {max} carácteres"
	)
    private String nationality;
	
	@Size(
		max=256,
		message = "Observaciones debe tener una longitud máxima de {max} carácteres"
	)
	private String observations;

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
		ProspectProfileDTO other = (ProspectProfileDTO) obj;
		return id.equals(other.id);
	}
	
}
