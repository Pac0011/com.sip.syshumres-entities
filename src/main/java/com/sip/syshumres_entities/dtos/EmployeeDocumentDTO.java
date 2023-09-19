package com.sip.syshumres_entities.dtos;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase DTO. Forma para documentos de empleados
 * 
 * @author Prong
 * @version 2.0
 */
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeDocumentDTO implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6436771854094960816L;

	private Long id;
    
    private EntitySelectDTO hiringDocuments;
    
    @Size(
		max=128,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
    private String document;

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
		EmployeeDocumentDTO other = (EmployeeDocumentDTO) obj;
		return id.equals(other.id);
	}

}
