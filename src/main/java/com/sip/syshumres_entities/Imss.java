package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Entity. Registro de movimientos del IMSS para empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="imss")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Imss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(
		min=4,
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
    private String name;
	
	@Column(columnDefinition = "boolean default true")
	private Boolean enabled;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Imss)) {
			return false;
		}
		Imss s = (Imss) obj;
		
		return this.id != null && this.id.equals(s.id);
	}
	
}
