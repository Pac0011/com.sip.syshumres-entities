package com.sip.syshumres_entities;

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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de datos clinicos para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_clinical_data")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeClinicalData extends BaseEntityLog {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="blood_type_id")
	private BloodType bloodType;
	
	@Column(columnDefinition = "float default 0")
	private float weight;
	
	@Column(columnDefinition = "float default 0")
	private float height;
	
	@Column(name = "medical_assistance", nullable=true, columnDefinition = "boolean default null")
	private Boolean medicalAssistance;
	
	@Size(
		max=128,
		message = "Las observaciones no debe ser mayor a {max} caracteres"
	)
	private String psychometry;
	
	@Column(name= "vaccinated", nullable=true, columnDefinition = "boolean default null")
	private Boolean vaccinated;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "employee_type_health_id")
	private EmployeeTypeHealth employeeTypeHealth;
	
	@Size(
		max=256,
		message = "Las observaciones no debe ser mayor a {max} caracteres"
	)
	private String observations;
	
	//enfermedades declaradas
	@Size(
		max=256,
		message = "La declaracion no debe ser mayor a {max} caracteres"
	)
	@Column(name = "declared_diseases")
	private String declaredDiseases;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "vaccine_dose_id")
	private VaccineDose vaccineDose;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "covid_vaccine_id")
	private CovidVaccine covidVaccine;
	
	@Size(
		max=64,
		message = "La url del certificado no debe ser mayor a {max} caracteres"
	)
    @Column(name = "covid__certificate", nullable = true)
	private String covidCertificate;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeClinicalData)) {
			return false;
		}
		EmployeeClinicalData s = (EmployeeClinicalData) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}
	
}
