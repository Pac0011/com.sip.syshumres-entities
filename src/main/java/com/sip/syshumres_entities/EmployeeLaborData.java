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
 * Clase Entity. Registro de info laboral para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_labor_data")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeLaborData extends BaseEntityLog {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(
		max=128,
		message = "Herramientas que usa debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "tools_use")
	private String toolsUse;
	
	@Column(name= "have_experience_security", nullable=true, columnDefinition = "boolean default null")
	private Boolean haveExperienceSecurity;
	
	@Size(
		max=256,
		message = "Detalle experiencia debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "detail_experience_security")
	private String detailExperienceSecurity;
	
	//Antedentes penales
	//Carta de recomendacion personal
	//Carta de recomendacion laboral
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "contact_last_job")
	private String contactLastJob;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_last_job")
	private String phoneLastJob;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "company_last_job")
	private String companyLastJob;
	
	@Column(name = "salary_last_job", columnDefinition = "float default 0")
	private float salaryLastJob;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date_last_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDateLastJob;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "end_date_last_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDateLastJob;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reason_quit_job_last_job_id")
	private ReasonQuitJob reasonQuitJobLastJob;
	
	@Size(
		max=128,
		message = "Actividades debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "activities_last_job")
	private String activitiesLastJob;
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "contact_penultimate_job")
	private String contactPenultimateJob;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_penultimate_job")
	private String phonePenultimateJob;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "company_penultimate_job")
	private String companyPenultimateJob;
	
	@Column(name = "salary_penultimate_job", columnDefinition = "float default 0")
	private float salaryPenultimateJob;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date_penultimate_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDatePenultimateJob;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "end_date_penultimate_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDatePenultimateJob;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reason_quit_job_penultimate_job_id")
	private ReasonQuitJob reasonQuitJobPenultimateJob;
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "contact_penultimate2_job")
	private String contactPenultimate2Job;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_penultimate2_job")
	private String phonePenultimate2Job;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "company_penultimate2_job")
	private String companyPenultimate2Job;
	
	@Column(name = "salary_penultimate2_job", columnDefinition = "float default 0")
	private float salaryPenultimate2Job;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date_penultimate2_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDatePenultimate2Job;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "end_date_penultimate2_job")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDatePenultimate2Job;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reason_quit_job_penultimate2_job_id")
	private ReasonQuitJob reasonQuitJobPenultimate2Job;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeeLaborData)) {
			return false;
		}
		EmployeeLaborData s = (EmployeeLaborData) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}
	
}
