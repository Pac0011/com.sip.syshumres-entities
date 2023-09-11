package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase DTO. Vista para Centros de costos
 * 
 * @author Prong
 * @version 2.0
 */
public class CostCenterDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2801476382058896191L;

	private Long id;
	
	private String description;
	
	private String code;
	
	private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
		CostCenterDTO other = (CostCenterDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "CostCenterDTO [id=" + id + ", description=" + description + ", code=" + code + ", enabled=" + enabled
				+ "]";
	}
	
}
