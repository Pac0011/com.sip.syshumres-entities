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
 * Clase DTO. Forma para datos clinicos Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeClinicalDataDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 263370448038603330L;

	private Long id;
	
	private EntitySelectDTO bloodType;
	
	private float weight;
	
	private float height;
	
	private Boolean medicalAssistance;
	
	@Size(
		max=128,
		message = "El psicometrico no debe ser mayor a {max} caracteres"
	)
	private String psychometry;
	
	private Boolean isVaccinated;
	
	private EntitySelectDTO employeeTypeHealth;
	
	@Size(
		max=256,
		message = "Las observaciones no debe ser mayor a {max} caracteres"
	)
	private String observations;
	
	@Size(
		max=256,
		message = "La declaracion no debe ser mayor a {max} caracteres"
	)
	private String declaredDiseases;
	
	private EntitySelectDTO vaccineDose;
	
	private EntitySelectDTO covidVaccine;
	
	@Size(
		max=64,
		message = "La url del certificado no debe ser mayor a {max} caracteres"
	)
	private String covidCertificate;

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
		EmployeeClinicalDataDTO other = (EmployeeClinicalDataDTO) obj;
		return id.equals(other.id);
	}
	
}
