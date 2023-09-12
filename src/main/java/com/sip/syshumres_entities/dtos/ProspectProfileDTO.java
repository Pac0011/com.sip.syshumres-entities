package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 * Clase DTO. Vista para Prospectos
 * 
 * @author Prong
 * @version 2.0
 */
public class ProspectProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -580277640515731413L;

	private Long id;

	private String ecript;
	
	private String curp;
	
	private String rfc;

	private String firstName;
	
	private String lastName;
		
	private String lastNameSecond;
	
	private String fullName;
	
	private EntitySelectDTO employeePosition;
	
	private Date dateBirth;
	
	private String phoneNumber;
	
	private String cellNumber;
	
	private String email;
	
	private EntitySelectDTO gender;
	
	private EntitySelectDTO prospectStatus;
	
	private EntitySelectDTO branchOffice;
	
    private String nationality;
	
	private String observations;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEcript() {
		return ecript;
	}

	public void setEcript(String ecript) {
		this.ecript = ecript;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
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

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public EntitySelectDTO getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(EntitySelectDTO employeePosition) {
		this.employeePosition = employeePosition;
	}

	public EntitySelectDTO getGender() {
		return gender;
	}

	public void setGender(EntitySelectDTO gender) {
		this.gender = gender;
	}

	public EntitySelectDTO getProspectStatus() {
		return prospectStatus;
	}

	public void setProspectStatus(EntitySelectDTO prospectStatus) {
		this.prospectStatus = prospectStatus;
	}

	public EntitySelectDTO getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(EntitySelectDTO branchOffice) {
		this.branchOffice = branchOffice;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
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
		ProspectProfileDTO other = (ProspectProfileDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "ProspectProfileDTO [id=" + id + ", ecript=" + ecript + ", curp=" + curp + ", rfc=" + rfc
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", lastNameSecond=" + lastNameSecond
				+ ", fullName=" + fullName + ", employeePosition=" + employeePosition + ", dateBirth=" + dateBirth
				+ ", phoneNumber=" + phoneNumber + ", cellNumber=" + cellNumber + ", email=" + email + "]";
	}
	
}
