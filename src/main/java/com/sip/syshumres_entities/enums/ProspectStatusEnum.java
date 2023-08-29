package com.sip.syshumres_entities.enums;

public enum ProspectStatusEnum {
	INICIO_PROCESO(1), EN_REVISION(2), RECHAZADO(3), CONTRATADO(4);
	private final long id;
	
	private ProspectStatusEnum(long id) { 
		this.id = id;
	}
	
    public long getValue() {
    	return id;
    }
}
