package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Catalogos de motivos de renuncias
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="reason_quit_job")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReasonQuitJob extends BaseEntityCatalog {
	
	/*
	 * Si es recontratable
	 */
	@Column(columnDefinition = "boolean default true")
	private boolean rehire;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ReasonQuitJob)) {
			return false;
		}
		ReasonQuitJob s = (ReasonQuitJob) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
