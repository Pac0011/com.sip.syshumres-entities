package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Clase DTO. Forma para datos generales Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
public class EmployeeGeneralDataDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5393916240274381425L;
	
	public EmployeeGeneralDataDTO() {
		super();
	}

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
	
	private Date driverLicenseDate;

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

	public Boolean isHaveChildren() {
		return haveChildren;
	}

	public void setHaveChildren(Boolean haveChildren) {
		this.haveChildren = haveChildren;
	}

	public int getHowManyChildren() {
		return howManyChildren;
	}

	public void setHowManyChildren(int howManyChildren) {
		this.howManyChildren = howManyChildren;
	}

	public Boolean isHaveHouse() {
		return haveHouse;
	}

	public void setHaveHouse(Boolean haveHouse) {
		this.haveHouse = haveHouse;
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

	public String getLiveWith() {
		return liveWith;
	}

	public void setLiveWith(String liveWith) {
		this.liveWith = liveWith;
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

	public float getAmountDebt() {
		return amountDebt;
	}

	public void setAmountDebt(float amountDebt) {
		this.amountDebt = amountDebt;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Boolean isPayRent() {
		return payRent;
	}

	public void setPayRent(Boolean payRent) {
		this.payRent = payRent;
	}

	public float getAmountRent() {
		return amountRent;
	}

	public void setAmountRent(float amountRent) {
		this.amountRent = amountRent;
	}

	public EntitySelectDTO getPreventiveReactiveManagement() {
		return preventiveReactiveManagement;
	}

	public void setPreventiveReactiveManagement(EntitySelectDTO preventiveReactiveManagement) {
		this.preventiveReactiveManagement = preventiveReactiveManagement;
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

	public EntitySelectDTO getDriverLicenseType() {
		return driverLicenseType;
	}

	public void setDriverLicenseType(EntitySelectDTO driverLicenseType) {
		this.driverLicenseType = driverLicenseType;
	}

	public EntitySelectDTO getDriverLicenseValidity() {
		return driverLicenseValidity;
	}

	public void setDriverLicenseValidity(EntitySelectDTO driverLicenseValidity) {
		this.driverLicenseValidity = driverLicenseValidity;
	}

	public EntitySelectDTO getSchoolGrade() {
		return schoolGrade;
	}

	public void setSchoolGrade(EntitySelectDTO schoolGrade) {
		this.schoolGrade = schoolGrade;
	}

	public EntitySelectDTO getSchoolGradeComplete() {
		return schoolGradeComplete;
	}

	public void setSchoolGradeComplete(EntitySelectDTO schoolGradeComplete) {
		this.schoolGradeComplete = schoolGradeComplete;
	}

	public String getSchoolGradeCompleteDetail() {
		return schoolGradeCompleteDetail;
	}

	public void setSchoolGradeCompleteDetail(String schoolGradeCompleteDetail) {
		this.schoolGradeCompleteDetail = schoolGradeCompleteDetail;
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

	public EntitySelectDTO getInductionRecord() {
		return inductionRecord;
	}

	public void setInductionRecord(EntitySelectDTO inductionRecord) {
		this.inductionRecord = inductionRecord;
	}

	public EntitySelectDTO getInductionBasicSystems() {
		return inductionBasicSystems;
	}

	public void setInductionBasicSystems(EntitySelectDTO inductionBasicSystems) {
		this.inductionBasicSystems = inductionBasicSystems;
	}

	public EntitySelectDTO getBasicSecurity() {
		return basicSecurity;
	}

	public void setBasicSecurity(EntitySelectDTO basicSecurity) {
		this.basicSecurity = basicSecurity;
	}

	public EntitySelectDTO getManagementTonfaPr24() {
		return managementTonfaPr24;
	}

	public void setManagementTonfaPr24(EntitySelectDTO managementTonfaPr24) {
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
	
	public Date getDriverLicenseDate() {
		return driverLicenseDate;
	}

	public void setDriverLicenseDate(Date driverLicenseDate) {
		this.driverLicenseDate = driverLicenseDate;
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
		EmployeeGeneralDataDTO other = (EmployeeGeneralDataDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeGeneralDataDTO [id=" + id + ", languagesSpeak=" + languagesSpeak + ", ine=" + ine
				+ ", haveEconomicDependents=" + haveEconomicDependents + ", monthlyExpenses=" + monthlyExpenses
				+ ", haveChildren=" + haveChildren + ", howManyChildren=" + howManyChildren + "]";
	}
	
}
