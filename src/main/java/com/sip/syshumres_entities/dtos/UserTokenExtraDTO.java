package com.sip.syshumres_entities.dtos;

public class UserTokenExtraDTO {
		
	private Long idBrachOffice;
	
	private Boolean seeAllBranchs;

	public UserTokenExtraDTO(Long idBrachOffice, Boolean seeAllBranchs) {
		super();
		this.idBrachOffice = idBrachOffice;
		this.seeAllBranchs = seeAllBranchs;
	}

	public Long getIdBrachOffice() {
		return idBrachOffice;
	}

	public void setIdBrachOffice(Long idBrachOffice) {
		this.idBrachOffice = idBrachOffice;
	}

	public Boolean isSeeAllBranchs() {
		return seeAllBranchs;
	}

	public void setSeeAllBranchs(Boolean seeAllBranchs) {
		this.seeAllBranchs = seeAllBranchs;
	}

}
