package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para datos generales Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeGeneralDataDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5393916240274381425L;

	private Long id;
	
	@Size(
		max=64,
		message = "Idiomas que habla debe tener una longitud máxima de {max} carácteres"
	)
    private String languagesSpeak;
    
	@Size(
		max=16,
		message = "Ine debe tener una longitud máxima de {max} carácteres"
	)
    private String ine;
	
	private Boolean haveEconomicDependents;
	
	private float monthlyExpenses;
	
	private Boolean haveChildren;
	
	private int howManyChildren;
	
	private Boolean haveHouse;
	
	@Size(
		max=256,
		message = "Vive con quien debe tener una longitud máxima de {max} carácteres"
	)
	private String liveWith;
	
	private Boolean haveCar;
	
	private Boolean haveDebts;
	
	private float amountDebt;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String skills;
	
	private Boolean payRent;
	
	private float amountRent;
	
    private EntitySelectDTO preventiveReactiveManagement;
		
    @Size(
		max=7,
		message = "Cartilla debe tener una longitud máxima de {max} carácteres"
	)
	private String militaryCertificate;
		
    @Size(
		max=16,
		message = "No. Licencia conducir debe tener una longitud máxima de {max} carácteres"
	)
	private String driverLicenseNumber;
	
    private EntitySelectDTO driverLicenseType;
	
	private EntitySelectDTO driverLicenseValidity;
	
	private EntitySelectDTO schoolGrade;
	
	private EntitySelectDTO schoolGradeComplete;
	
	private String schoolGradeCompleteDetail;
	
	@Size(
		max=16,
		message = "Teléfono para mensajes debe tener una longitud máxima de {max} carácteres"
	)
    private String phoneForMessages;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	private String particularReferences1;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
    private String phoneReferences1;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	private String relationshipReferences1;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	private String particularReferences2;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
    private String phoneReferences2;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	private String relationshipReferences2;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	private String particularReferences3;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
    private String phoneReferences3;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	private String relationshipReferences3;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	private String particularReferences;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	private String generalReferences;
		
	@Size(
		max=256,
		message = "Observaciones debe tener una longitud máxima de {max} carácteres"
	)
	private String observations;
	
	private EntitySelectDTO inductionRecord;
	
	private EntitySelectDTO inductionBasicSystems;
	
	private EntitySelectDTO basicSecurity;
		
	private EntitySelectDTO managementTonfaPr24;
	
	@Size(
		max=32,
		message = "Nacionalidad debe tener una longitud máxima de {max} carácteres"
	)
	private String nationality;
	 
	@Size(
		max=32,
		message = "Nació en debe tener una longitud máxima de {max} carácteres"
	)
	private String bornIn;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date driverLicenseDate;

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
		EmployeeGeneralDataDTO other = (EmployeeGeneralDataDTO) obj;
		return id.equals(other.id);
	}
	
}
