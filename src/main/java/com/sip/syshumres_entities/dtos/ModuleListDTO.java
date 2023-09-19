package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Lista para mostrar Modulos
 * 
 * @author Prong
 * @version 2.0
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ModuleListDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -917064320601193309L;

	private Long id;
	
	private String description;	
	
    private String father;
	
    @JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private List<ModuleListDTO> childs;

	public ModuleListDTO(Long id, String description, List<ModuleListDTO> childs) {
		super();
		this.id = id;
		this.description = description;
		this.childs = childs;
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
		ModuleListDTO other = (ModuleListDTO) obj;
		return id.equals(other.id);
	}

}
