package com.sip.syshumres_entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

/**
 * Clase Entity. Catalogo de roles para usuarios
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="authorities")
public class Authority {
	
	public Authority() {}

	public Authority(Long id, String description) {
		this.setId(id);
		this.setDescription(description);
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(max=32)
	private String description;
	
	@NotEmpty
	@Size(max=64)
	private String detail;

    @JsonIgnoreProperties(value = {"authorities", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "authorities")
    private List<User> users;
    
    @JoinTable(
        name = "authorities_privileges", 
        joinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id", nullable = false), 
        inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "id", nullable = false)
    )
    @JsonIgnoreProperties(value = {"authorities"}, allowSetters = true)
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Privilege> privileges;
    
    @JoinTable( 
        name = "authorities_modules", 
        joinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id", nullable = false), 
        inverseJoinColumns = @JoinColumn(name = "module_id", referencedColumnName = "id", nullable = false)
    )
    @JsonIgnoreProperties(value = {"authorities", "handler", "hibernateLazyInitializer"}, allowSetters = true)    
	@ManyToMany(cascade = CascadeType.DETACH)
    private List<Module> modules;
    
    public void addModule(Module module) {
		this.modules.add(module);
	}
	
	public void removeModule(Module module) {
		this.modules.remove(module);
	}
    
    @Column(columnDefinition = "boolean default true")
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Authority)) {
			return false;
		}
		Authority s = (Authority) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", description=" + description + ", detail=" + detail + ", users=" + users
				+ ", privileges=" + privileges + ", modules=" + modules + ", enabled=" + enabled + "]";
	}
	
}
