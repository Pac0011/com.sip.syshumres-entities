package com.sip.syshumres_entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Clase Entity. Table for Recovery password user from login
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="password_recovery")
@Getter
@Setter
@NoArgsConstructor
public class PasswordRecovery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
    private String email;
	
	@NotEmpty
	@Size(
		min=16,
		max=16,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
    private String uuid;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiration_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expirationDate;
	
	@PrePersist
	public void prePersist() {
		Date today = new Date();	
		this.created = today;
		this.expirationDate = new Date(today.getTime() + 3 * (3600*1000));
	}
	
	@Column(columnDefinition = "boolean default true")
	private boolean enabled;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof PasswordRecovery)) {
			return false;
		}
		PasswordRecovery s = (PasswordRecovery) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
