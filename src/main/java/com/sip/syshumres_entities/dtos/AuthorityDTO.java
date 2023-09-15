package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Clase DTO. Forma para Roles
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
public class AuthorityDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6715754285297926332L;
	
	public AuthorityDTO() {
		super();
	}

	private Long id;
	
	@NotEmpty
	@Size(max=32)
	private String description;
	
	@NotEmpty
	@Size(max=64)
	private String detail;
	
    private List<EntitySelectDTO> users;
    
    private List<EntitySelectDTO> modules;
    
    private List<ModuleListDTO> modulesDtos;
    
	private boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EntitySelectDTO> getUsers() {
		return users;
	}

	public void setUsers(List<EntitySelectDTO> users) {
		this.users = users;
	}

	public List<EntitySelectDTO> getModules() {
		return modules;
	}

	public void setModules(List<EntitySelectDTO> modules) {
		this.modules = modules;
	}

	public List<ModuleListDTO> getModulesDtos() {
		return modulesDtos;
	}

	public void setModulesDtos(List<ModuleListDTO> modulesDtos) {
		this.modulesDtos = modulesDtos;
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
		AuthorityDTO other = (AuthorityDTO) obj;
		return id.equals(other.id);
	}

	@Override
	public String toString() {
		return "AuthorityDTO [id=" + id + ", description=" + description + ", detail=" + detail + ", enabled=" + enabled
				+ "]";
	}
	
}
