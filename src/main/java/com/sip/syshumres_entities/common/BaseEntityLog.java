package com.sip.syshumres_entities.common;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase. Entity comun para tablas
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntityLog {
	
	//private long id_user_created
	
	//private long id_user_updated
	
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date created;
	
	@PrePersist
	public void prePersist() {
		this.created = new Date();
	}
	
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updated;
	
	@PreUpdate
	public void preUpdate() {
		this.updated = new Date();
	}

	@Override
	public String toString() {
		return " BaseEntityLog [created=" + created + ", updated=" + updated + "]";
	}

}
