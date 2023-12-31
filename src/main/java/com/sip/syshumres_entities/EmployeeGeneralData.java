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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de info general para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_general_data")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeGeneralData extends BaseEntityLog {
		
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
	
	@Temporal(TemporalType.DATE)
	@Column(name= "driver_license_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
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
	
}
