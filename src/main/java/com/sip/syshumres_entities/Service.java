package com.sip.syshumres_entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*
 * Catalogo de servicios para los clientes
 */
@Entity
@Table(name="services")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * Clave operativa
	 */
	@NotEmpty
	@Size(min=4, max=64)
    private String code;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="client_id")
    private Client client;
	
    @Column(columnDefinition = "boolean default true")
	private boolean enabled;
    
    @Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Service)) {
			return false;
		}
		Service s = (Service) obj;
		
		return this.getId() != null && this.getId().equals(s.getId());
	}
	
}
