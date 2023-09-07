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
 * Clase Entity. Registro de info laboral para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_labor_data")
public class EmployeeLaborData extends BaseEntityLog {
	
	public EmployeeLaborData() {}
	
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
	
	@Column(name = "start_date_last_job")
	private Date startDateLastJob;
	
	@Column(name = "end_date_last_job")
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
	
	@Column(name = "start_date_penultimate_job")
	private Date startDatePenultimateJob;
	
	@Column(name = "end_date_penultimate_job")
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
	
	@Column(name = "start_date_penultimate2_job")
	private Date startDatePenultimate2Job;
	
	@Column(name = "end_date_penultimate2_job")
	private Date endDatePenultimate2Job;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="reason_quit_job_penultimate2_job_id")
	private ReasonQuitJob reasonQuitJobPenultimate2Job;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToolsUse() {
		return toolsUse;
	}

	public void setToolsUse(String toolsUse) {
		this.toolsUse = toolsUse;
	}

	public Boolean isHaveExperienceSecurity() {
		return haveExperienceSecurity;
	}

	public void setHaveExperienceSecurity(Boolean haveExperienceSecurity) {
		this.haveExperienceSecurity = haveExperienceSecurity;
	}

	public String getDetailExperienceSecurity() {
		return detailExperienceSecurity;
	}

	public void setDetailExperienceSecurity(String detailExperienceSecurity) {
		this.detailExperienceSecurity = detailExperienceSecurity;
	}

	public String getContactLastJob() {
		return contactLastJob;
	}

	public void setContactLastJob(String contactLastJob) {
		this.contactLastJob = contactLastJob;
	}

	public String getPhoneLastJob() {
		return phoneLastJob;
	}

	public void setPhoneLastJob(String phoneLastJob) {
		this.phoneLastJob = phoneLastJob;
	}

	public String getCompanyLastJob() {
		return companyLastJob;
	}

	public void setCompanyLastJob(String companyLastJob) {
		this.companyLastJob = companyLastJob;
	}

	public float getSalaryLastJob() {
		return salaryLastJob;
	}

	public void setSalaryLastJob(float salaryLastJob) {
		this.salaryLastJob = salaryLastJob;
	}

	public Date getStartDateLastJob() {
		return startDateLastJob;
	}

	public void setStartDateLastJob(Date startDateLastJob) {
		this.startDateLastJob = startDateLastJob;
	}

	public Date getEndDateLastJob() {
		return endDateLastJob;
	}

	public void setEndDateLastJob(Date endDateLastJob) {
		this.endDateLastJob = endDateLastJob;
	}

	public ReasonQuitJob getReasonQuitJobLastJob() {
		return reasonQuitJobLastJob;
	}

	public void setReasonQuitJobLastJob(ReasonQuitJob reasonQuitJobLastJob) {
		this.reasonQuitJobLastJob = reasonQuitJobLastJob;
	}

	public String getActivitiesLastJob() {
		return activitiesLastJob;
	}

	public void setActivitiesLastJob(String activitiesLastJob) {
		this.activitiesLastJob = activitiesLastJob;
	}

	public String getContactPenultimateJob() {
		return contactPenultimateJob;
	}

	public void setContactPenultimateJob(String contactPenultimateJob) {
		this.contactPenultimateJob = contactPenultimateJob;
	}

	public String getPhonePenultimateJob() {
		return phonePenultimateJob;
	}

	public void setPhonePenultimateJob(String phonePenultimateJob) {
		this.phonePenultimateJob = phonePenultimateJob;
	}

	public String getCompanyPenultimateJob() {
		return companyPenultimateJob;
	}

	public void setCompanyPenultimateJob(String companyPenultimateJob) {
		this.companyPenultimateJob = companyPenultimateJob;
	}

	public float getSalaryPenultimateJob() {
		return salaryPenultimateJob;
	}

	public void setSalaryPenultimateJob(float salaryPenultimateJob) {
		this.salaryPenultimateJob = salaryPenultimateJob;
	}

	public Date getStartDatePenultimateJob() {
		return startDatePenultimateJob;
	}

	public void setStartDatePenultimateJob(Date startDatePenultimateJob) {
		this.startDatePenultimateJob = startDatePenultimateJob;
	}

	public Date getEndDatePenultimateJob() {
		return endDatePenultimateJob;
	}

	public void setEndDatePenultimateJob(Date endDatePenultimateJob) {
		this.endDatePenultimateJob = endDatePenultimateJob;
	}

	public ReasonQuitJob getReasonQuitJobPenultimateJob() {
		return reasonQuitJobPenultimateJob;
	}

	public void setReasonQuitJobPenultimateJob(ReasonQuitJob reasonQuitJobPenultimateJob) {
		this.reasonQuitJobPenultimateJob = reasonQuitJobPenultimateJob;
	}

	public String getContactPenultimate2Job() {
		return contactPenultimate2Job;
	}

	public void setContactPenultimate2Job(String contactPenultimate2Job) {
		this.contactPenultimate2Job = contactPenultimate2Job;
	}

	public String getPhonePenultimate2Job() {
		return phonePenultimate2Job;
	}

	public void setPhonePenultimate2Job(String phonePenultimate2Job) {
		this.phonePenultimate2Job = phonePenultimate2Job;
	}

	public String getCompanyPenultimate2Job() {
		return companyPenultimate2Job;
	}

	public void setCompanyPenultimate2Job(String companyPenultimate2Job) {
		this.companyPenultimate2Job = companyPenultimate2Job;
	}

	public float getSalaryPenultimate2Job() {
		return salaryPenultimate2Job;
	}

	public void setSalaryPenultimate2Job(float salaryPenultimate2Job) {
		this.salaryPenultimate2Job = salaryPenultimate2Job;
	}

	public Date getStartDatePenultimate2Job() {
		return startDatePenultimate2Job;
	}

	public void setStartDatePenultimate2Job(Date startDatePenultimate2Job) {
		this.startDatePenultimate2Job = startDatePenultimate2Job;
	}

	public Date getEndDatePenultimate2Job() {
		return endDatePenultimate2Job;
	}

	public void setEndDatePenultimate2Job(Date endDatePenultimate2Job) {
		this.endDatePenultimate2Job = endDatePenultimate2Job;
	}

	public ReasonQuitJob getReasonQuitJobPenultimate2Job() {
		return reasonQuitJobPenultimate2Job;
	}

	public void setReasonQuitJobPenultimate2Job(ReasonQuitJob reasonQuitJobPenultimate2Job) {
		this.reasonQuitJobPenultimate2Job = reasonQuitJobPenultimate2Job;
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
		
		if (!(obj instanceof EmployeeLaborData)) {
			return false;
		}
		EmployeeLaborData s = (EmployeeLaborData) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}

	@Override
	public String toString() {
		return "EmployeeLaborData [id=" + id + ", toolsUse=" + toolsUse + ", haveExperienceSecurity="
				+ haveExperienceSecurity + ", detailExperienceSecurity=" + detailExperienceSecurity
				+ ", contactLastJob=" + contactLastJob + ", phoneLastJob=" + phoneLastJob + ", companyLastJob="
				+ companyLastJob + "]";
	}
	
}
