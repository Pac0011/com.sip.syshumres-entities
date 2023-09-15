package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Clase DTO. Vista para perfil Empleado
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
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
	
	private Date dateBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEcript() {
		return ecript;
	}

	public void setEcript(String ecript) {
		this.ecript = ecript;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEmployeePositionProfile() {
		return employeePositionProfile;
	}

	public void setEmployeePositionProfile(String employeePositionProfile) {
		this.employeePositionProfile = employeePositionProfile;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public String getTypeHiring() {
		return typeHiring;
	}

	public void setTypeHiring(String typeHiring) {
		this.typeHiring = typeHiring;
	}

	public String getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(String branchOffice) {
		this.branchOffice = branchOffice;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getEmployeeArea() {
		return employeeArea;
	}

	public void setEmployeeArea(String employeeArea) {
		this.employeeArea = employeeArea;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastNameSecond() {
		return lastNameSecond;
	}

	public void setLastNameSecond(String lastNameSecond) {
		this.lastNameSecond = lastNameSecond;
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
		EmployeeProfileViewDTO other = (EmployeeProfileViewDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeProfileViewDTO [id=" + id + ", employeeNumber=" + employeeNumber + ", employeeType="
				+ employeeType + ", ecript=" + ecript + ", fullName=" + fullName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", lastNameSecond=" + lastNameSecond + ", rfc=" + rfc + ", curp=" + curp
				+ ", nss=" + nss + ", service=" + service + "]";
	}
	
}
