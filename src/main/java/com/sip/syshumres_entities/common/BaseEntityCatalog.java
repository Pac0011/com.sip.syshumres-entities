package com.sip.syshumres_entities.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase. Entity comun para Catalogos
 * 
 * @author Prong
 * @version 2.0
 */
@MappedSuperclass
@Getter
@Setter
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
	
	//@Column(nullable = true, columnDefinition = "TINYINT(1)")
	@Column(columnDefinition = "boolean default true")
	private boolean enabled;

	@Override
	public String toString() {
		return " BaseEntityCatalog [id=" + id + ", description=" + description + ", enabled=" + enabled + super.toString();
	}
}
