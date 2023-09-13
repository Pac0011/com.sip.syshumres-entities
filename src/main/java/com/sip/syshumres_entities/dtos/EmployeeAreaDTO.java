package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


/**
 * Clase DTO. Forma para Areas
 * 
 * @author Prong
 * @version 2.0
 */
public class EmployeeAreaDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6897626775696378030L;
	
	public EmployeeAreaDTO() {
		super();
	}

	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
	private String description;
	
	private EntitySelectDTO costCenter;
	
	private EntitySelectDTO father;
	
	private List<EntitySelectDTO> childs;
	
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

	public EntitySelectDTO getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(EntitySelectDTO costCenter) {
		this.costCenter = costCenter;
	}

	public EntitySelectDTO getFather() {
		return father;
	}

	public void setFather(EntitySelectDTO father) {
		this.father = father;
	}

	public List<EntitySelectDTO> getChilds() {
		return childs;
	}

	public void setChilds(List<EntitySelectDTO> childs) {
		this.childs = childs;
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
		EmployeeAreaDTO other = (EmployeeAreaDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "EmployeeAreaDTO [id=" + id + ", description=" + description + ", costCenter=" + costCenter
				+ ", enabled=" + enabled + "]";
	}
	
}
