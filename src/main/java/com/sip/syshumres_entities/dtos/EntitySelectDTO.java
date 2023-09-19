package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase. DTO comun para select<html>
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EntitySelectDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6713769118290899289L;

	public EntitySelectDTO(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
	private Long id;
	
	private String description;

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

}
