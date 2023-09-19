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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Authority {

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
	
}
