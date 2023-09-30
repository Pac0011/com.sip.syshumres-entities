package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para datos prenomina Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeePayrollDTO implements Serializable {    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1373988390277591844L;

	private Long id;
	
	@Size(
	    min = 12,
		max = 14,
		message = "Rfc debe tener una longitud entre {min} y {max} caracteres"
	)
    private String rfc;
	
	@Size(
		min=11, 
		max=13,
		message = "Nss debe tener una longitud entre {min} y {max} caracteres"
	)
	private String nss;
	
	private EntitySelectDTO typeHiring;
	
	private EntitySelectDTO invoicedResourceType;
	
	private float salaryMonthly;

	@Size(
		max = 128,
		message = "Salario en letra debe tener máximo {max} caracteres"
	)
	private String salaryMonthlyLetter;
	
	private float dailySalary;
	
	@Valid
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private AddressDTO employeeAddressFiscal;

	private EntitySelectDTO payrollType;

	@Size(
		max = 10,
		message = "No. de crédito Infonavit debe tener máximo {max} caracteres"
	)
	private String creditNumberInfonavit;
	
	private float sdb;

	private float sdi;

	private EntitySelectDTO employeeBank;

	@Size(
		max = 12,
		message = "Cuenta de banco debe tener máximo {max} caracteres"
	)
	private String bankAccount;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
	private String bankAccountFile;
	
	@Size(
		max = 19,
		message = "Clabe interbancaria debe tener máximo {max} caracteres"
	)
	private String clabe;
	
	private Boolean haveInfonavitCredit;

	private EntitySelectDTO factorDiscountInfonavit;

	private float amountFactorDiscountInfonavit;
		
	private Boolean haveAlimony;
			
	private float amountAlimony;
			
	private Boolean haveFonacotCredit;
		
	@Size(
		max = 16,
		message = "No. crédito Fonacot debe tener máximo {max} caracteres"
	)
	private String numberFonacotCredit;
			
	private float amountFactorDiscountFonacot;
	
	private EntitySelectDTO dinningRoom;
	
	private Boolean haveSgmm;
	
	private float amountSgmm;

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
		EmployeePayrollDTO other = (EmployeePayrollDTO) obj;
		return id.equals(other.id);
	}
	
}
