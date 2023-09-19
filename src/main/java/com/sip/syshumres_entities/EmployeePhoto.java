package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.common.BaseEntityLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de fotos de empleados
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="employee_photos")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeePhoto extends BaseEntityLog {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "photo_front")
	private String photoFront;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "photo_right")
	private String photoRight;
	
	@Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	@Column(name = "photo_left")
	private String photoLeft;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof EmployeePhoto)) {
			return false;
		}
		EmployeePhoto s = (EmployeePhoto) obj;
		
		return this.id != null && this.id.equals(s.getId());
	}
	
}
