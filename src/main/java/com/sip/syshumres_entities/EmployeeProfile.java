package com.sip.syshumres_entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;


/**
 * Clase Entity. Registro de datos principales del empleado
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_profiles")
public class EmployeeProfile extends BaseEntityLog {
	
	public EmployeeProfile() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(
		min=17, 
		max=19,
		message = "Curp debe tener una longitud entre {min} y {max} caracteres"
	)
	private String curp;

    //@Column(name = "file_curp", nullable = true)
    //@Basic(optional = false, fetch = FetchType.LAZY)
	//@JsonIgnore
	//@Lob()
	//private byte[] fileCurp;
    @Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
    @Column(name = "file_curp", nullable = true)
    private String fileCurp;
	
	public Integer getFileCurpHashCode() {
		return (this.fileCurp != null)? this.fileCurp.hashCode(): null;
	}
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
    @Column(name = "front_photo", nullable = true)
	private String frontPhoto;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
    @Column(name = "left_photo", nullable = true)
	private String leftPhoto;
	
	@Size(
		max=64,
		message = "La url de la imagen no debe ser mayor a {max} caracteres"
	)
    @Column(name = "right_photo", nullable = true)
	private String rightPhoto;
	
	@Size(
		min=9,
		max=9,
		message = "El No. de empleado debe tener una longitud entre {min} y {max} caracteres"
	)
    @Column(name = "employee_number")
	public String employeeNumber;

	//Hash para crear carpeta para documentos de empleado separadas
	//@Size(min=12, max=12)
	private String ecript;
	
	@Transient
	public String getFullName() {
		return new StringBuilder(Optional.ofNullable(this.firstName).orElse(""))
				.append(" ")
				.append(Optional.ofNullable(this.lastName).orElse(""))
				.append(" ")
				.append(Optional.ofNullable(this.lastNameSecond).orElse("")).toString();
	}

	@NotEmpty
	@Size(
		min=1, 
		max=64,
		message = "Nombre debe tener una longitud entre {min} y {max} caracteres"
	)
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty
	@Size(
		min=1, 
		max=64,
		message = "Apellido paterno debe tener una longitud entre {min} y {max} caracteres"
	)
	@Column(name = "last_name")
	private String lastName;
	
	@Size(
		max=64,
		message = "Apellido materno debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "last_name_second")
	private String lastNameSecond;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_birth")
	private Date dateBirth;
	
	@Size(
		max=12,
		message = "Número teléfono debe tener una longitud máxima de {max} caracteres"
	)
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Size(
		max=12,
		message = "Número celular debe tener una longitud mñaxima de {max} caracteres"
	)
	@Column(name = "cell_number")
	private String cellNumber;
	
	@NotEmpty
	@Email
	@Column(length=64, nullable=false, unique=true)
	private String email;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="employee_position_id")
	private EmployeePosition employeePosition;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "employee_position_profile_id")
	private EmployeePositionProfile employeePositionProfile;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "employee_area_id")
	private EmployeeArea employeeArea;
	
	//fecha de alta
	@Temporal(TemporalType.DATE)
	@Column(name = "date_employment")
	private Date dateEmployment;
		
	//fecha de baja
	@Temporal(TemporalType.DATE)
	@Column(name = "date_leave")
	private Date dateLeave;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="marital_status_id")
	private MaritalStatus maritalStatus;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "gender_id")
	private Gender gender;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_address_id")
	@Valid
	private EmployeeAddress employeeAddress;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="branch_office_id")
	private BranchOffice branchOffice;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "employee_status_id")
	private EmployeeStatus employeeStatus;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_photo_id")
	private EmployeePhoto employeePhoto;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_general_data_id")
	@Valid
	private EmployeeGeneralData employeeGeneralData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_clinical_data_id")
	@Valid
	private EmployeeClinicalData employeeClinicalData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_labor_data_id")
	@Valid
	private EmployeeLaborData employeeLaborData;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_payroll_id")
	@Valid
	private EmployeePayroll employeePayroll;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_operation_id")
	@Valid
	private EmployeeOperation employeeOperation;
	
	//cascade = CascadeType.ALL, orphanRemoval = true, EmployeeDocumentController hace la insercion de estos documentos
	@JsonIgnoreProperties(value = {"employeeProfile"}, allowSetters = true)
	@OneToMany(mappedBy = "employeeProfile", fetch = FetchType.LAZY)
	private List<EmployeeDocument> employeeDocuments;
	
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

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
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
		if (firstName == null || firstName.equals("")) { throw new IllegalArgumentException("Nombre es invalido"); }
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

	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public BranchOffice getBranchOffice() {
		return branchOffice;
	}

	public void setBranchOffice(BranchOffice branchOffice) {
		this.branchOffice = branchOffice;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
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

	public EmployeePosition getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(EmployeePosition employeePosition) {
		this.employeePosition = employeePosition;
	}

	public EmployeePositionProfile getEmployeePositionProfile() {
		return employeePositionProfile;
	}

	public void setEmployeePositionProfile(EmployeePositionProfile employeePositionProfile) {
		this.employeePositionProfile = employeePositionProfile;
	}

	public EmployeeArea getEmployeeArea() {
		return employeeArea;
	}

	public void setEmployeeArea(EmployeeArea employeeArea) {
		this.employeeArea = employeeArea;
	}

	public Date getDateEmployment() {
		return dateEmployment;
	}

	public void setDateEmployment(Date dateEmployment) {
		this.dateEmployment = dateEmployment;
	}

	public Date getDateLeave() {
		return dateLeave;
	}

	public void setDateLeave(Date dateLeave) {
		this.dateLeave = dateLeave;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public EmployeePhoto getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(EmployeePhoto employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public EmployeeGeneralData getEmployeeGeneralData() {
		return employeeGeneralData;
	}

	public void setEmployeeGeneralData(EmployeeGeneralData employeeGeneralData) {
		this.employeeGeneralData = employeeGeneralData;
	}

	public EmployeePayroll getEmployeePayroll() {
		return employeePayroll;
	}

	public void setEmployeePayroll(EmployeePayroll employeePayroll) {
		this.employeePayroll = employeePayroll;
	}

	public EmployeeOperation getEmployeeOperation() {
		return employeeOperation;
	}

	public void setEmployeeOperation(EmployeeOperation employeeOperation) {
		this.employeeOperation = employeeOperation;
	}
	
	public EmployeeClinicalData getEmployeeClinicalData() {
		return employeeClinicalData;
	}

	public void setEmployeeClinicalData(EmployeeClinicalData employeeClinicalData) {
		this.employeeClinicalData = employeeClinicalData;
	}

	public EmployeeLaborData getEmployeeLaborData() {
		return employeeLaborData;
	}

	public void setEmployeeLaborData(EmployeeLaborData employeeLaborData) {
		this.employeeLaborData = employeeLaborData;
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

	public List<EmployeeDocument> getEmployeeDocuments() {
		return employeeDocuments;
	}

	public void setEmployeeDocuments(List<EmployeeDocument> employeeDocuments) {
		this.employeeDocuments = employeeDocuments;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeProfile)) {
			return false;
		}
		EmployeeProfile s = (EmployeeProfile) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

	@Override
	public String toString() {
		return "EmployeeProfile [id=" + id + ", curp=" + curp + ", ecript=" + ecript + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", lastNameSecond=" + lastNameSecond + ", dateBirth=" + dateBirth
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
