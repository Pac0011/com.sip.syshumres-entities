package com.sip.syshumres_entities;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

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
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sip.syshumres_entities.common.BaseEntityLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de expediente de Prospectos
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="prospect_profile")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProspectProfile extends BaseEntityLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Hash para crear carpeta para documentos de empleado separadas
	@Size(
		min=12,
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String ecript;
	
	@NotEmpty
	@Size(
		min=17, 
		max=19,
		message = "Curp debe tener una longitud entre {min} y {max} caracteres"
	)
	private String curp;
	
	@Size(
		max = 14,
		message = "Rfc debe tener una longitud maxima de {max} caracteres"
	)
	private String rfc;

	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "first_name")
	private String firstName;
		
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "last_name")
	private String lastName;
		
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "last_name_second")
	private String lastNameSecond;
	
	@Transient
	public String getFullName() {
		return new StringBuilder(Optional.ofNullable(this.firstName).orElse(""))
				.append(" ")
				.append(Optional.ofNullable(this.lastName).orElse(""))
				.append(" ")
				.append(Optional.ofNullable(this.lastNameSecond).orElse("")).toString();
	}
		
	@Temporal(TemporalType.DATE)
	@Column(name = "date_birth")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;
	
	@Size(
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Size(
		max=12,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "cell_number")
	private String cellNumber;
	
	@NotEmpty
	@Email
	@Size(max=64)
	private String email;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "gender_id")
	private Gender gender;
	
	@Size(
		max=32,
		message = "Nacionalidad debe tener una longitud máxima de {max} carácteres"
	)
	private String nationality;
	
	@Size(
		max=256,
		message = "Observaciones debe tener una longitud máxima de {max} carácteres"
	)
	private String observations;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="employee_position_id")
	private EmployeePosition employeePosition;
	
	@JsonIgnoreProperties(value = {"childs", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="branch_office_id")
	private BranchOffice branchOffice;
	
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="prospect_status_id")
	private ProspectStatus prospectStatus;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ProspectProfile)) {
			return false;
		}
		ProspectProfile s = (ProspectProfile) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
