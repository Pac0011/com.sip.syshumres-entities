package com.sip.syshumres_entities.common;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Clase. Entity comun para tablas
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
public class BaseEntityLog {
	
	//private long id_user_created;
	
	//private long id_user_updated;
	
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created;
	
	@PrePersist
	public void prePersist() {
		this.created = new Date();
	}
	
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated;
	
	@PreUpdate
	public void preUpdate() {
		this.updated = new Date();
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return " BaseEntityLog [created=" + created + ", updated=" + updated + "]";
	}

}
