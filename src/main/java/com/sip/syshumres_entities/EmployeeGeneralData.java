package com.sip.syshumres_entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;


/**
 * Clase Entity. Registro de info general para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_general_data")
public class EmployeeGeneralData extends BaseEntityLog {
	
	public EmployeeGeneralData() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(
		max=64,
		message = "Idiomas que habla debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "languages_speak")
	private String languagesSpeak;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "skills")
	private String skills;
	
	@Size(
		max=7,
		message = "Cartilla debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "military_certificate")
	private String militaryCertificate;
	
	@Size(
		max=16,
		message = "Ine debe tener una longitud máxima de {max} carácteres"
	)
	private String ine;
	
	@Column(name = "have_economic_dependents", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveEconomicDependents;
	
	@Column(name = "monthly_expenses", columnDefinition = "float default 0")
	private float monthlyExpenses;
	
	@Column(name= "have_children", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveChildren;
	
	@Column(name = "how_many_children", columnDefinition = "integer default 0")
	private int howManyChildren;
	
	@Column(name= "have_house", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveHouse;
	
	@Size(
		max=256,
		message = "Vive con quien debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "live_with")
	private String liveWith;
	
	@Column(name= "have_car", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveCar;
	
	@Column(name= "have_debts", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveDebts;
	
	@Column(name = "amount_debt", columnDefinition = "float default 0")
	private float amountDebt;
	
	@Column(name= "pay_rent", nullable=true, columnDefinition = "boolean default null")
	private Boolean payRent;
	
	@Column(name = "amount_rent", columnDefinition = "float default 0")
	private float amountRent;
		
	@Size(
		max=16,
		message = "No. Licencia conducir debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "driver_license_number")
	private String driverLicenseNumber;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "driver_license_type_id")
	private DriverLicenseType driverLicenseType;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "driver_license_validity_id")
	private DriverLicenseValidity driverLicenseValidity;
	
	@JoinColumn(name= "driver_license_date")
	private Date driverLicenseDate;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="school_grade_id")
	private SchoolGrade schoolGrade;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "school_grade_complete_id")
	private SchoolGradeComplete schoolGradeComplete;
	
	@Size(
		max=16,
		message = "Teléfono para mensajes debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_for_messages")
	private String phoneForMessages;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "particular_references1")
	private String particularReferences1;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_references1")
	private String phoneReferences1;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "relationship_references1")
	private String relationshipReferences1;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "particular_references2")
	private String particularReferences2;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_references2")
	private String phoneReferences2;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "relationship_references2")
	private String relationshipReferences2;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "particular_references3")
	private String particularReferences3;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_references3")
	private String phoneReferences3;
	
	@Size(
		max=32,
		message = "Parentesco debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "relationship_references3")
	private String relationshipReferences3;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "particular_references")
	private String particularReferences;
	
	@Size(
		max=128,
		message = "Referencias particulares debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "general_references")
	private String generalReferences;
		
	@Size(
		max=256,
		message = "Observaciones debe tener una longitud máxima de {max} carácteres"
	)
	private String observations;
	
	//manejo preventivo
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="preventive_reactive_management_id")
	private ExpertType preventiveReactiveManagement;
	
	//Registro de induccion
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="induction_record_id")
	private ExpertType inductionRecord;
		
	//induccion sistema basico
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="induction_basic_systems_id")
	private ExpertType inductionBasicSystems;
		
	//basico seguridad
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="basic_security_id")
	private ExpertType basicSecurity;
		
	//manejo tonfa
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="management_tonfa_pr24_id")
	private ExpertType managementTonfaPr24;
	
	@Size(
		max=32,
		message = "Nacionalidad debe tener una longitud máxima de {max} carácteres"
	)
	private String nationality;
	 
	@Size(
		max=32,
		message = "Nació en debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "born_in")
	private String bornIn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public String getLanguagesSpeak() {
		return languagesSpeak;
	}

	public void setLanguagesSpeak(String languagesSpeak) {
		this.languagesSpeak = languagesSpeak;
	}
	
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Boolean getHaveEconomicDependents() {
		return haveEconomicDependents;
	}

	public Boolean getHaveChildren() {
		return haveChildren;
	}

	public Boolean getHaveHouse() {
		return haveHouse;
	}

	public Boolean getHaveCar() {
		return haveCar;
	}

	public Boolean getHaveDebts() {
		return haveDebts;
	}

	public Boolean getPayRent() {
		return payRent;
	}

	public Boolean isHaveEconomicDependents() {
		return haveEconomicDependents;
	}

	public void setHaveEconomicDependents(Boolean haveEconomicDependents) {
		this.haveEconomicDependents = haveEconomicDependents;
	}

	public float getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public void setMonthlyExpenses(float monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}

	public int getHowManyChildren() {
		return howManyChildren;
	}

	public void setHowManyChildren(int howManyChildren) {
		this.howManyChildren = howManyChildren;
	}

	public String getLiveWith() {
		return liveWith;
	}

	public void setLiveWith(String liveWith) {
		this.liveWith = liveWith;
	}

	public float getAmountDebt() {
		return amountDebt;
	}

	public void setAmountDebt(float amountDebt) {
		this.amountDebt = amountDebt;
	}

	public float getAmountRent() {
		return amountRent;
	}

	public void setAmountRent(float amountRent) {
		this.amountRent = amountRent;
	}

	public ExpertType getPreventiveReactiveManagement() {
		return preventiveReactiveManagement;
	}

	public void setPreventiveReactiveManagement(ExpertType preventiveReactiveManagement) {
		this.preventiveReactiveManagement = preventiveReactiveManagement;
	}

	public DriverLicenseType getDriverLicenseType() {
		return driverLicenseType;
	}

	public void setDriverLicenseType(DriverLicenseType driverLicenseType) {
		this.driverLicenseType = driverLicenseType;
	}

	public String getMilitaryCertificate() {
		return militaryCertificate;
	}

	public void setMilitaryCertificate(String militaryCertificate) {
		this.militaryCertificate = militaryCertificate;
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public DriverLicenseValidity getDriverLicenseValidity() {
		return driverLicenseValidity;
	}

	public void setDriverLicenseValidity(DriverLicenseValidity driverLicenseValidity) {
		this.driverLicenseValidity = driverLicenseValidity;
	}

	public Date getDriverLicenseDate() {
		return driverLicenseDate;
	}

	public void setDriverLicenseDate(Date driverLicenseDate) {
		this.driverLicenseDate = driverLicenseDate;
	}

	public SchoolGrade getSchoolGrade() {
		return schoolGrade;
	}

	public void setSchoolGrade(SchoolGrade schoolGrade) {
		this.schoolGrade = schoolGrade;
	}

	public SchoolGradeComplete getSchoolGradeComplete() {
		return schoolGradeComplete;
	}

	public void setSchoolGradeComplete(SchoolGradeComplete schoolGradeComplete) {
		this.schoolGradeComplete = schoolGradeComplete;
	}

	public String getPhoneForMessages() {
		return phoneForMessages;
	}

	public void setPhoneForMessages(String phoneForMessages) {
		this.phoneForMessages = phoneForMessages;
	}

	public String getParticularReferences1() {
		return particularReferences1;
	}

	public void setParticularReferences1(String particularReferences1) {
		this.particularReferences1 = particularReferences1;
	}

	public String getParticularReferences2() {
		return particularReferences2;
	}

	public void setParticularReferences2(String particularReferences2) {
		this.particularReferences2 = particularReferences2;
	}

	public String getParticularReferences3() {
		return particularReferences3;
	}

	public void setParticularReferences3(String particularReferences3) {
		this.particularReferences3 = particularReferences3;
	}

	public String getPhoneReferences1() {
		return phoneReferences1;
	}

	public void setPhoneReferences1(String phoneReferences1) {
		this.phoneReferences1 = phoneReferences1;
	}

	public String getRelationshipReferences1() {
		return relationshipReferences1;
	}

	public void setRelationshipReferences1(String relationshipReferences1) {
		this.relationshipReferences1 = relationshipReferences1;
	}

	public String getPhoneReferences2() {
		return phoneReferences2;
	}

	public void setPhoneReferences2(String phoneReferences2) {
		this.phoneReferences2 = phoneReferences2;
	}

	public String getRelationshipReferences2() {
		return relationshipReferences2;
	}

	public void setRelationshipReferences2(String relationshipReferences2) {
		this.relationshipReferences2 = relationshipReferences2;
	}

	public String getPhoneReferences3() {
		return phoneReferences3;
	}

	public void setPhoneReferences3(String phoneReferences3) {
		this.phoneReferences3 = phoneReferences3;
	}

	public String getRelationshipReferences3() {
		return relationshipReferences3;
	}

	public void setRelationshipReferences3(String relationshipReferences3) {
		this.relationshipReferences3 = relationshipReferences3;
	}

	public String getParticularReferences() {
		return particularReferences;
	}

	public void setParticularReferences(String particularReferences) {
		this.particularReferences = particularReferences;
	}

	public String getGeneralReferences() {
		return generalReferences;
	}

	public void setGeneralReferences(String generalReferences) {
		this.generalReferences = generalReferences;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public ExpertType getInductionRecord() {
		return inductionRecord;
	}

	public void setInductionRecord(ExpertType inductionRecord) {
		this.inductionRecord = inductionRecord;
	}

	public ExpertType getInductionBasicSystems() {
		return inductionBasicSystems;
	}

	public void setInductionBasicSystems(ExpertType inductionBasicSystems) {
		this.inductionBasicSystems = inductionBasicSystems;
	}

	public ExpertType getBasicSecurity() {
		return basicSecurity;
	}

	public void setBasicSecurity(ExpertType basicSecurity) {
		this.basicSecurity = basicSecurity;
	}

	public ExpertType getManagementTonfaPr24() {
		return managementTonfaPr24;
	}

	public void setManagementTonfaPr24(ExpertType managementTonfaPr24) {
		this.managementTonfaPr24 = managementTonfaPr24;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getBornIn() {
		return bornIn;
	}

	public void setBornIn(String bornIn) {
		this.bornIn = bornIn;
	}

	public Boolean isHaveChildren() {
		return haveChildren;
	}

	public void setHaveChildren(Boolean haveChildren) {
		this.haveChildren = haveChildren;
	}

	public Boolean isHaveHouse() {
		return haveHouse;
	}

	public void setHaveHouse(Boolean haveHouse) {
		this.haveHouse = haveHouse;
	}

	public Boolean isHaveCar() {
		return haveCar;
	}

	public void setHaveCar(Boolean haveCar) {
		this.haveCar = haveCar;
	}

	public Boolean isHaveDebts() {
		return haveDebts;
	}

	public void setHaveDebts(Boolean haveDebts) {
		this.haveDebts = haveDebts;
	}

	public Boolean isPayRent() {
		return payRent;
	}

	public void setPayRent(Boolean payRent) {
		this.payRent = payRent;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeGeneralData)) {
			return false;
		}
		EmployeeGeneralData s = (EmployeeGeneralData) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

	@Override
	public String toString() {
		return "EmployeeGeneralData [id=" + id + ", languagesSpeak=" + languagesSpeak + ", skills=" + skills
				+ ", militaryCertificate=" + militaryCertificate + ", ine=" + ine + ", haveEconomicDependents="
				+ haveEconomicDependents + ", monthlyExpenses=" + monthlyExpenses + "]";
	}
	
}
