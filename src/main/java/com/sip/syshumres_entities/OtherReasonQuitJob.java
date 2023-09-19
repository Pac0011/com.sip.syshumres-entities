package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sip.syshumres_entities.common.BaseEntityCatalog;

import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Clase Entity. Catalogo de otras razones de renuncia empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="other_reason_quit_job")
@NoArgsConstructor
@ToString
public class OtherReasonQuitJob extends BaseEntityCatalog {
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof OtherReasonQuitJob)) {
			return false;
		}
		OtherReasonQuitJob s = (OtherReasonQuitJob) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

}
