package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase. DTO comun para select<html>
 * 
 * @author Prong
 * @version 2.0
 */
public class EntitySelectDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6713769118290899289L;

	public EntitySelectDTO() {}

	public EntitySelectDTO(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
	private Long id;
	
	private String description;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntitySelectDTO other = (EntitySelectDTO) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "EntitySelectDTO [id=" + id + ", description=" + description + "]";
	}
	
}
