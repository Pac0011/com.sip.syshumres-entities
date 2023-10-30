package com.sip.syshumres_entities.dtos;

import java.util.HashMap;
import java.util.Map;

public class ResponseDTO {
	
	private Map<String, Object> data;

    public ResponseDTO() {
        this.data = new HashMap<>();
    }

    public ResponseDTO(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void addEntry(String key, String value) {
        this.data.put(key, value);
    }

}
