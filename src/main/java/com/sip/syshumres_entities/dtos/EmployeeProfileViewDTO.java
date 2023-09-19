package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Vista para perfil Empleado
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeProfileViewDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7226879060689157638L;

	private Long id;
	
	private String employeeNumber;
	
	private String employeeType;
	
	private String ecript;

	private String fullName;
	
	private String firstName;
	
	private String lastName;
	
	private String lastNameSecond;
	
	private String rfc;
	
	private String curp;
	
	private String nss;
	
	private String service;
	
	private String employeeArea;
	
	private String employeePositionProfile;
	
	private String employeePosition;
	
	private String employeeStatus;
	
	private String typeHiring;
	
	private String branchOffice;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;

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
		EmployeeProfileViewDTO other = (EmployeeProfileViewDTO) obj;
		return id.equals(other.id);
	}
	
}
