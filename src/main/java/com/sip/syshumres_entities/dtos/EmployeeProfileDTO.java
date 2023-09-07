package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.EmployeeAddress;


/**
 * Clase DTO. Forma para perfil Empleado
 * 
 * @author Prong
 * @version 2.0
 */
public class EmployeeProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 718343071254050577L;

	private Long id;
	
	private String curp;
	
	private String fileCurp;
	
	private String frontPhoto;
	
	private String leftPhoto;
	
	private String rightPhoto;
	
	private String employeeNumber;
	
	private EntitySelectDTO employeeType;
	
	private String ecript;

	private String firstName;
	
	private String lastName;
	
	private String lastNameSecond;
	
	private String phoneNumber;
	
	private String cellNumber;
	
	private String email;
	
    private EntitySelectDTO employeePosition;
	
	private EntitySelectDTO employeePositionProfile;
	
	private EntitySelectDTO employeeArea;
	
	private Date dateEmployment;
		
	private Date dateLeave;
	
	private EntitySelectDTO service;
	
	private EntitySelectDTO employeeStatus;
	
	private EntitySelectDTO typeHiring;
	
	private EntitySelectDTO branchOffice;
	
	private EntitySelectDTO maritalStatus;
	
	private EntitySelectDTO gender;
	
	private Date dateBirth;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeAddress employeeAddress;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeClinicalDataDTO employeeClinicalData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeGeneralDataDTO employeeGeneralData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeeLaborDataDTO employeeLaborData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private EmployeePayrollDTO employeePayroll;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private List<EmployeeDocumentDTO> employeeDocuments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getFileCurp() {
		return fileCurp;
	}

	public void setFileCurp(String fileCurp) {
		this.fileCurp = fileCurp;
	}

	public String getFrontPhoto() {
		return frontPhoto;
	}

	public void setFrontPhoto(String frontPhoto) {
		this.frontPhoto = frontPhoto;
	}

	public String getLeftPhoto() {
		return leftPhoto;
	}

	public void setLeftPhoto(String leftPhoto) {
		this.leftPhoto = leftPhoto;
	}

	public String getRightPhoto() {
		return rightPhoto;
	}

	public void setRightPhoto(String rightPhoto) {
		this.rightPhoto = rightPhoto;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public EntitySelectDTO getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EntitySelectDTO employeeType) {
		this.employeeType = employeeType;
	}

	public String getEcript() {
		return ecript;
	}

	public void setEcript(String ecript) {
		this.ecript = ecript;
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

	public Date getDateLeave() {
		return dateLeave;
	}

	public void setDateLeave(Date dateLeave) {
		this.dateLeave = dateLeave;
	}

	public EntitySelectDTO getService() {
		return service;
	}

	public void setService(EntitySelectDTO service) {
		this.service = service;
	}

	public EntitySelectDTO getEmployeeArea() {
		return employeeArea;
	}

	public void setEmployeeArea(EntitySelectDTO employeeArea) {
		this.employeeArea = employeeArea;
	}

	public EntitySelectDTO getEmployeePositionProfile() {
		return employeePositionProfile;
	}

	public void setEmployeePositionProfile(EntitySelectDTO employeePositionProfile) {
		this.employeePositionProfile = employeePositionProfile;
	}

	public EntitySelectDTO getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(EntitySelectDTO employeePosition) {
		this.employeePosition = employeePosition;
	}

	public EntitySelectDTO getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EntitySelectDTO employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public EntitySelectDTO getTypeHiring() {
		return typeHiring;
	}

	public void setTypeHiring(EntitySelectDTO typeHiring) {
		this.typeHiring = typeHiring;
	}

	public EntitySelectDTO getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(EntitySelectDTO branchOffice) {
		this.branchOffice = branchOffice;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Date getDateEmployment() {
		return dateEmployment;
	}

	public void setDateEmployment(Date dateEmployment) {
		this.dateEmployment = dateEmployment;
	}

	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public EntitySelectDTO getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(EntitySelectDTO maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public EntitySelectDTO getGender() {
		return gender;
	}

	public void setGender(EntitySelectDTO gender) {
		this.gender = gender;
	}

	public EmployeeClinicalDataDTO getEmployeeClinicalData() {
		return employeeClinicalData;
	}

	public void setEmployeeClinicalData(EmployeeClinicalDataDTO employeeClinicalData) {
		this.employeeClinicalData = employeeClinicalData;
	}

	public EmployeeGeneralDataDTO getEmployeeGeneralData() {
		return employeeGeneralData;
	}

	public void setEmployeeGeneralData(EmployeeGeneralDataDTO employeeGeneralData) {
		this.employeeGeneralData = employeeGeneralData;
	}

	public EmployeeLaborDataDTO getEmployeeLaborData() {
		return employeeLaborData;
	}

	public void setEmployeeLaborData(EmployeeLaborDataDTO employeeLaborData) {
		this.employeeLaborData = employeeLaborData;
	}

	public EmployeePayrollDTO getEmployeePayroll() {
		return employeePayroll;
	}

	public void setEmployeePayroll(EmployeePayrollDTO employeePayroll) {
		this.employeePayroll = employeePayroll;
	}

	public List<EmployeeDocumentDTO> getEmployeeDocuments() {
		return employeeDocuments;
	}

	public void setEmployeeDocuments(List<EmployeeDocumentDTO> employeeDocuments) {
		this.employeeDocuments = employeeDocuments;
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
		EmployeeProfileDTO other = (EmployeeProfileDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeProfileDTO [id=" + id + ", curp=" + curp + ", employeeNumber=" + employeeNumber
				+ ", employeeType=" + employeeType + ", ecript=" + ecript + ", firstName=" + firstName + ", lastName="
				+ lastName + ", lastNameSecond=" + lastNameSecond + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
