package com.sip.syshumres_entities;

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

import java.util.List;
import java.util.Objects;

/**
 * Clase Entity. Catalogo de privilegios para usuarios
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="privileges")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Privilege {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@NotEmpty
	@Size(max=64)
    private String name;

    @JsonIgnoreProperties(value = {"privileges", "handler", "hibernateLazyInitializer"})
    @ManyToMany(mappedBy = "privileges")
    private List<Authority> authorities;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Privilege)) {
			return false;
		}
		Privilege s = (Privilege) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
