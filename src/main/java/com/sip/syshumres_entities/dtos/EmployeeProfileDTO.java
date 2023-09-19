package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para perfil Empleado
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 718343071254050577L;

	private Long id;
	
	@NotEmpty
	@Size(
		min=17, 
		max=19,
		message = "Curp debe tener una longitud entre {min} y {max} caracteres"
	)
	private String curp;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
	private String fileCurp;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
	private String frontPhoto;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
	private String leftPhoto;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
	private String rightPhoto;
	
	@Size(
		min=9,
		max=9,
		message = "El No. de empleado debe tener una longitud entre {min} y {max} caracteres"
	)
	private String employeeNumber;
	
	private EntitySelectDTO employeeType;
	
	@Size(max=12)
	private String ecript;

	@NotEmpty
	@Size(
		min=1, 
		max=64,
		message = "Nombre debe tener una longitud entre {min} y {max} caracteres"
	)
	private String firstName;
	
	@NotEmpty
	@Size(
		min=1, 
		max=64,
		message = "Apellido paterno debe tener una longitud entre {min} y {max} caracteres"
	)
	private String lastName;
	
	@Size(
		max=64,
		message = "Apellido materno debe tener una longitud máxima de {max} caracteres"
	)
	private String lastNameSecond;
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	private String phoneNumber;
	
	@Size(
		max=12,
		message = "Número celular debe tener una longitud mñaxima de {max} caracteres"
	)
	private String cellNumber;
	
	@NotEmpty
	@Email
	@Size(
		max=64,
		message = "Email debe tener una longitud máxima de {max} caracteres"
	)
	private String email;
	
    private EntitySelectDTO employeePosition;
	
	private EntitySelectDTO employeePositionProfile;
	
	private EntitySelectDTO employeeArea;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateEmployment;
		
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateLeave;
	
	private EntitySelectDTO service;
	
	private EntitySelectDTO employeeStatus;
	
	private EntitySelectDTO typeHiring;
	
	private EntitySelectDTO branchOffice;
	
	private EntitySelectDTO maritalStatus;
	
	private EntitySelectDTO gender;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeAddressDTO employeeAddress;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeClinicalDataDTO employeeClinicalData;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeGeneralDataDTO employeeGeneralData;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeLaborDataDTO employeeLaborData;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeePayrollDTO employeePayroll;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private List<EmployeeDocumentDTO> employeeDocuments;

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
		EmployeeProfileDTO other = (EmployeeProfileDTO) obj;
		return id.equals(other.id);
	}
	
}
