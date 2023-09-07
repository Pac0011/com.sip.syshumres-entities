package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.EmployeeAddress;


/**
 * Clase DTO. Forma para datos prenomina Empleados
 * 
 * @author Prong
 * @version 2.0
 */
public class EmployeePayrollDTO implements Serializable {    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1373988390277591844L;

	private Long id;
	
    private String rfc;
	
	private String nss;
	
	private EntitySelectDTO typeHiring;
	
	private EntitySelectDTO invoicedResourceType;
	
	private float salaryMonthly;

	private String salaryMonthlyLetter;
	
	private float dailySalary;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeAddress employeeAddressFiscal;

	private EntitySelectDTO payrollType;

	private String creditNumberInfonavit;
	
	private float sdb;

	private float sdi;

	private EntitySelectDTO employeeBank;

	private String bankAccount;
	
	private String clabe;
	
	private String bankAccountFile;
	
	private Boolean haveInfonavitCredit;

	private EntitySelectDTO factorDiscountInfonavit;

	private float amountFactorDiscountInfonavit;
		
	private Boolean haveAlimony;
			
	private float amountAlimony;
			
	private Boolean haveFonacotCredit;
			
	private String numberFonacotCredit;
			
	private float amountFactorDiscountFonacot;
	
	private EntitySelectDTO dinningRoom;
	
	private Boolean haveSgmm;
	
	private float amountSgmm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public EntitySelectDTO getTypeHiring() {
		return typeHiring;
	}

	public void setTypeHiring(EntitySelectDTO typeHiring) {
		this.typeHiring = typeHiring;
	}

	public EntitySelectDTO getInvoicedResourceType() {
		return invoicedResourceType;
	}

	public void setInvoicedResourceType(EntitySelectDTO invoicedResourceType) {
		this.invoicedResourceType = invoicedResourceType;
	}

	public float getSalaryMonthly() {
		return salaryMonthly;
	}

	public void setSalaryMonthly(float salaryMonthly) {
		this.salaryMonthly = salaryMonthly;
	}

	public String getSalaryMonthlyLetter() {
		return salaryMonthlyLetter;
	}

	public void setSalaryMonthlyLetter(String salaryMonthlyLetter) {
		this.salaryMonthlyLetter = salaryMonthlyLetter;
	}

	public float getDailySalary() {
		return dailySalary;
	}

	public void setDailySalary(float dailySalary) {
		this.dailySalary = dailySalary;
	}

	public EmployeeAddress getEmployeeAddressFiscal() {
		return employeeAddressFiscal;
	}

	public void setEmployeeAddressFiscal(EmployeeAddress employeeAddressFiscal) {
		this.employeeAddressFiscal = employeeAddressFiscal;
	}

	public EntitySelectDTO getPayrollType() {
		return payrollType;
	}

	public void setPayrollType(EntitySelectDTO payrollType) {
		this.payrollType = payrollType;
	}

	public String getCreditNumberInfonavit() {
		return creditNumberInfonavit;
	}

	public void setCreditNumberInfonavit(String creditNumberInfonavit) {
		this.creditNumberInfonavit = creditNumberInfonavit;
	}

	public float getSdb() {
		return sdb;
	}

	public void setSdb(float sdb) {
		this.sdb = sdb;
	}

	public float getSdi() {
		return sdi;
	}

	public void setSdi(float sdi) {
		this.sdi = sdi;
	}

	public EntitySelectDTO getEmployeeBank() {
		return employeeBank;
	}

	public void setEmployeeBank(EntitySelectDTO employeeBank) {
		this.employeeBank = employeeBank;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public String getBankAccountFile() {
		return bankAccountFile;
	}

	public void setBankAccountFile(String bankAccountFile) {
		this.bankAccountFile = bankAccountFile;
	}

	public Boolean isHaveInfonavitCredit() {
		return haveInfonavitCredit;
	}

	public void setHaveInfonavitCredit(Boolean haveInfonavitCredit) {
		this.haveInfonavitCredit = haveInfonavitCredit;
	}

	public EntitySelectDTO getFactorDiscountInfonavit() {
		return factorDiscountInfonavit;
	}

	public void setFactorDiscountInfonavit(EntitySelectDTO factorDiscountInfonavit) {
		this.factorDiscountInfonavit = factorDiscountInfonavit;
	}

	public float getAmountFactorDiscountInfonavit() {
		return amountFactorDiscountInfonavit;
	}

	public void setAmountFactorDiscountInfonavit(float amountFactorDiscountInfonavit) {
		this.amountFactorDiscountInfonavit = amountFactorDiscountInfonavit;
	}

	public Boolean isHaveAlimony() {
		return haveAlimony;
	}

	public void setHaveAlimony(Boolean haveAlimony) {
		this.haveAlimony = haveAlimony;
	}

	public float getAmountAlimony() {
		return amountAlimony;
	}

	public void setAmountAlimony(float amountAlimony) {
		this.amountAlimony = amountAlimony;
	}

	public Boolean isHaveFonacotCredit() {
		return haveFonacotCredit;
	}

	public void setHaveFonacotCredit(Boolean haveFonacotCredit) {
		this.haveFonacotCredit = haveFonacotCredit;
	}

	public String getNumberFonacotCredit() {
		return numberFonacotCredit;
	}

	public void setNumberFonacotCredit(String numberFonacotCredit) {
		this.numberFonacotCredit = numberFonacotCredit;
	}

	public float getAmountFactorDiscountFonacot() {
		return amountFactorDiscountFonacot;
	}

	public void setAmountFactorDiscountFonacot(float amountFactorDiscountFonacot) {
		this.amountFactorDiscountFonacot = amountFactorDiscountFonacot;
	}

	public EntitySelectDTO getDinningRoom() {
		return dinningRoom;
	}

	public void setDinningRoom(EntitySelectDTO dinningRoom) {
		this.dinningRoom = dinningRoom;
	}

	public Boolean getHaveSgmm() {
		return haveSgmm;
	}

	public void setHaveSgmm(Boolean haveSgmm) {
		this.haveSgmm = haveSgmm;
	}

	public float getAmountSgmm() {
		return amountSgmm;
	}

	public void setAmountSgmm(float amountSgmm) {
		this.amountSgmm = amountSgmm;
	}

	public Boolean getHaveInfonavitCredit() {
		return haveInfonavitCredit;
	}

	public Boolean getHaveAlimony() {
		return haveAlimony;
	}

	public Boolean getHaveFonacotCredit() {
		return haveFonacotCredit;
	}

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

	@Override
	public String toString() {
		return "EmployeePayrollDTO [id=" + id + ", rfc=" + rfc + ", nss=" + nss + ", typeHiring=" + typeHiring
				+ ", invoicedResourceType=" + invoicedResourceType + ", salaryMonthly=" + salaryMonthly
				+ ", salaryMonthlyLetter=" + salaryMonthlyLetter + "]";
	}
	
}
