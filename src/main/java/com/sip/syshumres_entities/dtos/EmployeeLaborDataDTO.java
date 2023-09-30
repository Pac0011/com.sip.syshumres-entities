package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sip.syshumres_entities.dtos.common.EntitySelectDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase DTO. Forma para datos laborales Empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeLaborDataDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4474223633989051074L;

	private Long id;
	
	@Size(
		max=128,
		message = "Herramientas que usa debe tener una longitud máxima de {max} carácteres"
	)
	private String toolsUse;
	
	private Boolean haveExperienceSecurity;
	
	@Size(
		max=256,
		message = "Detalle experiencia debe tener una longitud máxima de {max} carácteres"
	)
	private String detailExperienceSecurity;
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	private String contactLastJob;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	private String phoneLastJob;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	private String companyLastJob;
	
	private float salaryLastJob;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDateLastJob;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDateLastJob;
	
	private EntitySelectDTO reasonQuitJobLastJob;
	
	@Size(
		max=128,
		message = "Actividades debe tener una longitud máxima de {max} carácteres"
	)
	private String activitiesLastJob;
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	private String contactPenultimateJob;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	private String phonePenultimateJob;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	private String companyPenultimateJob;
	
	private float salaryPenultimateJob;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDatePenultimateJob;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDatePenultimateJob;
	
	private EntitySelectDTO reasonQuitJobPenultimateJob;
	
	@Size(
		max=64,
		message = "Contacto debe tener una longitud máxima de {max} carácteres"
	)
	private String contactPenultimate2Job;
	
	@Size(
		max=16,
		message = "Teléfono debe tener una longitud máxima de {max} carácteres"
	)
	private String phonePenultimate2Job;
	
	@Size(
		max=64,
		message = "Empresa debe tener una longitud máxima de {max} carácteres"
	)
	private String companyPenultimate2Job;
	
	private float salaryPenultimate2Job;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDatePenultimate2Job;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDatePenultimate2Job;
	
	private EntitySelectDTO reasonQuitJobPenultimate2Job;

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
	
}
