package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Clase DTO. Lista para mostrar Modulos
 * 
 * @author Prong
 * @version 2.0
 */
public class ModuleListDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -917064320601193309L;

	private Long id;
	
	private String description;	
	
    private String father;
	
	private List<ModuleListDTO> childs;
	
	public ModuleListDTO() {
		super();
	}

	public ModuleListDTO(Long id, String description, List<ModuleListDTO> childs) {
		super();
		this.id = id;
		this.description = description;
		this.childs = childs;
	}
	
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

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public List<ModuleListDTO> getChilds() {
		return childs;
	}

	public void setChilds(List<ModuleListDTO> childs) {
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

	@Override
	public String toString() {
		return "ModuleListDTO [id=" + id + ", description=" + description + ", father=" + father + "]";
	}

}
