package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 * Clase DTO. Forma para datos laborales Empleados
 * 
 * @author Prong
 * @version 2.0
 */
public class EmployeeLaborDataDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4474223633989051074L;

	private Long id;
	
	private String toolsUse;
	
	private Boolean haveExperienceSecurity;
	
	private String detailExperienceSecurity;
	
	private String contactLastJob;
	
	private String phoneLastJob;
	
	private String companyLastJob;
	
	private float salaryLastJob;
	
	private Date startDateLastJob;
	
	private Date endDateLastJob;
	
	private EntitySelectDTO reasonQuitJobLastJob;
	
	private String activitiesLastJob;
	
	private String contactPenultimateJob;
	
	private String phonePenultimateJob;
	
	private String companyPenultimateJob;
	
	private float salaryPenultimateJob;
	
	private Date startDatePenultimateJob;
	
	private Date endDatePenultimateJob;
	
	private EntitySelectDTO reasonQuitJobPenultimateJob;
	
	private String contactPenultimate2Job;
	
	private String phonePenultimate2Job;
	
	private String companyPenultimate2Job;
	
	private float salaryPenultimate2Job;
	
	private Date startDatePenultimate2Job;
	
	private Date endDatePenultimate2Job;
	
	private EntitySelectDTO reasonQuitJobPenultimate2Job;

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

	public EntitySelectDTO getReasonQuitJobLastJob() {
		return reasonQuitJobLastJob;
	}

	public void setReasonQuitJobLastJob(EntitySelectDTO reasonQuitJobLastJob) {
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

	public EntitySelectDTO getReasonQuitJobPenultimateJob() {
		return reasonQuitJobPenultimateJob;
	}

	public void setReasonQuitJobPenultimateJob(EntitySelectDTO reasonQuitJobPenultimateJob) {
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

	public EntitySelectDTO getReasonQuitJobPenultimate2Job() {
		return reasonQuitJobPenultimate2Job;
	}

	public void setReasonQuitJobPenultimate2Job(EntitySelectDTO reasonQuitJobPenultimate2Job) {
		this.reasonQuitJobPenultimate2Job = reasonQuitJobPenultimate2Job;
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
		EmployeeLaborDataDTO other = (EmployeeLaborDataDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeLaborDataDTO [id=" + id + ", toolsUse=" + toolsUse + ", haveExperienceSecurity="
				+ haveExperienceSecurity + ", detailExperienceSecurity=" + detailExperienceSecurity
				+ ", contactLastJob=" + contactLastJob + ", phoneLastJob=" + phoneLastJob + ", companyLastJob="
				+ companyLastJob + "]";
	}
	
}
