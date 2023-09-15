package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.EmployeeAddress;


/**
 * Clase DTO. Forma para perfil Empleado
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
public class EmployeeProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 718343071254050577L;

	public EmployeeProfileDTO() {
		super();
	}

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
	private Date dateEmployment;
		
	@Temporal(TemporalType.DATE)
	private Date dateLeave;
	
	private EntitySelectDTO service;
	
	private EntitySelectDTO employeeStatus;
	
	private EntitySelectDTO typeHiring;
	
	private EntitySelectDTO branchOffice;
	
	private EntitySelectDTO maritalStatus;
	
	private EntitySelectDTO gender;
	
	@Temporal(TemporalType.DATE)
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
