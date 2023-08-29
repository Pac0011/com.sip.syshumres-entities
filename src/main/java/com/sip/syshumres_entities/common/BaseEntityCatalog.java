package com.sip.syshumres_entities.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
//import javax.persistence.PrePersist;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Clase. Entity comun para Catalogos
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
public class BaseEntityCatalog extends BaseEntityLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(
		min=1,
		max=64,
		message = "debe tener una longitud entre {min} y {max} caracteres"
	)
    private String description;
	
	@Column(columnDefinition = "boolean default true")
	//@Column(nullable = true, columnDefinition = "TINYINT(1)")
	private boolean enabled;
	
//	@PrePersist
//	public void prePersist() {
//	    if (this.active == null) {
//	        setActive(true);
//	    }
//	}
	
	//Orden de los campos
	//private int ord;

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
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "BaseEntityCatalog [id=" + ", description=" + description + ", enabled=" + enabled + super.toString();
	}
}
