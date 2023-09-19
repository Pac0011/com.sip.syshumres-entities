package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sip.syshumres_entities.common.BaseEntityLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Clase Entity. Registro de evaluaciones de Prospectos
 * 
 * @author Prong
 * @version 2.0
 */
@Entity
@Table(name="prospect_evaluation")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProspectEvaluation extends BaseEntityLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(
		max=256,
		message = "debe tener una longitud máxima de {max} carácteres"
	)
	private String response;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="prospect_profile_id")
	private ProspectProfile prospectProfile;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="evaluation_id")
	private Evaluation evaluation;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ProspectEvaluation)) {
			return false;
		}
		ProspectEvaluation s = (ProspectEvaluation) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
