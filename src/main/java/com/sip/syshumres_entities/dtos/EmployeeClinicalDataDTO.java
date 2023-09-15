package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Clase DTO. Forma para datos clinicos Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
public class EmployeeClinicalDataDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 263370448038603330L;
	
	public EmployeeClinicalDataDTO() {
		super();
	}

	private Long id;
	
	private EntitySelectDTO bloodType;
	
	private float weight;
	
	private float height;
	
	private Boolean medicalAssistance;
	
	@Size(
		max=128,
		message = "El psicometrico no debe ser mayor a {max} caracteres"
	)
	private String psychometry;
	
	private Boolean isVaccinated;
	
	private EntitySelectDTO employeeTypeHealth;
	
	@Size(
		max=256,
		message = "Las observaciones no debe ser mayor a {max} caracteres"
	)
	private String observations;
	
	@Size(
		max=256,
		message = "La declaracion no debe ser mayor a {max} caracteres"
	)
	private String declaredDiseases;
	
	private EntitySelectDTO vaccineDose;
	
	private EntitySelectDTO covidVaccine;
	
	@Size(
		max=64,
		message = "La url del certificado no debe ser mayor a {max} caracteres"
	)
	private String covidCertificate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EntitySelectDTO getBloodType() {
		return bloodType;
	}

	public void setBloodType(EntitySelectDTO bloodType) {
		this.bloodType = bloodType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Boolean isMedicalAssistance() {
		return medicalAssistance;
	}

	public void setMedicalAssistance(Boolean medicalAssistance) {
		this.medicalAssistance = medicalAssistance;
	}

	public String getPsychometry() {
		return psychometry;
	}

	public void setPsychometry(String psychometry) {
		this.psychometry = psychometry;
	}

	public Boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public EntitySelectDTO getEmployeeTypeHealth() {
		return employeeTypeHealth;
	}

	public void setEmployeeTypeHealth(EntitySelectDTO employeeTypeHealth) {
		this.employeeTypeHealth = employeeTypeHealth;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getDeclaredDiseases() {
		return declaredDiseases;
	}

	public void setDeclaredDiseases(String declaredDiseases) {
		this.declaredDiseases = declaredDiseases;
	}

	public EntitySelectDTO getVaccineDose() {
		return vaccineDose;
	}

	public void setVaccineDose(EntitySelectDTO vaccineDose) {
		this.vaccineDose = vaccineDose;
	}

	public EntitySelectDTO getCovidVaccine() {
		return covidVaccine;
	}

	public void setCovidVaccine(EntitySelectDTO covidVaccine) {
		this.covidVaccine = covidVaccine;
	}

	public Boolean getIsVaccinated() {
		return isVaccinated;
	}

	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public String getCovidCertificate() {
		return covidCertificate;
	}

	public void setCovidCertificate(String covidCertificate) {
		this.covidCertificate = covidCertificate;
	}

	public Boolean getMedicalAssistance() {
		return medicalAssistance;
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
		EmployeeClinicalDataDTO other = (EmployeeClinicalDataDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeClinicalDataDTO [id=" + id + ", weight=" + weight + ", height=" + height + ", psychometry="
				+ psychometry + ", isVaccinated=" + isVaccinated + ", observations=" + observations + "]";
	}
	
}
