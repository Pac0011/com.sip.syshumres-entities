	package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de info para nomina de empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_payrolls")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeePayroll extends BaseEntityLog {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@NotEmpty
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
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "type_hiring_id")
	private TypeHiring typeHiring;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "invoiced_resource_type_id")
	private InvoicedResourceType invoicedResourceType;
	
	//AfterTaxes
	@Column(name = "salary_monthly", columnDefinition = "float default 0")
	private float salaryMonthly;
	
	@Transient
	public float getDailySalary() {
		return this.salaryMonthly / 30;
	}

	@Size(
		max = 128,
		message = "Salario en letra debe tener máximo {max} caracteres"
	)
	@Column(name = "salary_monthly_letter")
	private String salaryMonthlyLetter;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_address_fiscal_id")
	@Valid
	private EmployeeAddress employeeAddressFiscal;

	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payroll_type_id")
	private PayrollType payrollType;

	@Size(
		max = 10,
		message = "No. de crédito Infonavit debe tener máximo {max} caracteres"
	)
	@Column(name = "credit_number_infonavit")
	private String creditNumberInfonavit;
	
	@Column(columnDefinition = "float default 0")
	private float sdb;

	@Column(columnDefinition = "float default 0")
	private float sdi;

	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_bank_id")
	private EmployeeBank employeeBank;

	@Size(
		max = 12,
		message = "Cuenta de banco debe tener máximo {max} caracteres"
	)
	@Column(name = "bank_account")
	private String bankAccount;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
    @Column(name = "bank_account_file", nullable = true)
	private String bankAccountFile;

	@Size(
		max = 19,
		message = "Clabe interbancaria debe tener máximo {max} caracteres"
	)
	private String clabe;
	
	@Column(name = "have_infonavit_credit", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveInfonavitCredit;

	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "factor_discount_infonavit_id")
	private FactorDiscountInfonavit factorDiscountInfonavit;

	@Column(name = "amount_factor_discount_infonavit", columnDefinition = "float default 0")
	private float amountFactorDiscountInfonavit;
		
	//Pension alimenticia
	@Column(name= "have_alimony", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveAlimony;
			
	@Column(name = "amount_alimony", columnDefinition = "float default 0")
	private float amountAlimony;
			
	@Column(name= "have_fonacot_credit", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveFonacotCredit;
			
	@Size(
		max = 16,
		message = "No. crédito Fonacot debe tener máximo {max} caracteres"
	)
	@Column(name = "number_fonacot_credit")
	private String numberFonacotCredit;
			
	@Column(name = "amount_factor_discount_fonacot", columnDefinition = "float default 0")
	private float amountFactorDiscountFonacot;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dinning_room_id")
	private DinningRoom dinningRoom;
	
	@Column(name= "have_sgmm", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveSgmm;
	
	@Column(name = "amount_sgmm", columnDefinition = "float default 0")
	private float amountSgmm;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeePayroll)) {
			return false;
		}
		EmployeePayroll s = (EmployeePayroll) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

}
