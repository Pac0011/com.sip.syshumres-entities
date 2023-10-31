package com.sip.syshumres_entities.utils;

import java.util.Map;
import java.util.Optional;

import org.springframework.validation.BindingResult;

import com.sip.syshumres_entities.dtos.ResponseDTO;

/**
 * Valida los campos en el request 
 * 
 * @author Prong
 * @version 2.0
 */
public class ErrorsBindingFields {
	
	private ErrorsBindingFields() {// Noncompliant - method is empty
	}
	
	public static  ResponseDTO getErrors(BindingResult result) {
		ResponseDTO errors = new ResponseDTO();
		result.getFieldErrors().forEach(err -> {
			String field = err.getField();
			//Se coloca \\. para que no lo interprete como un regrex
			//field = field.replaceAll("\\.","_")
			//Valid number the class inner
			//Recorta el objeto hasta 1 nivel y replaza . por _
			if (field.chars().filter(ch -> ch == '.').count() > 0) {
				field = splitString(field);
			}
			errors.addEntry(field, "El campo " + err.getDefaultMessage());
			
		});
		return errors;
	}
	
	public static  ResponseDTO getErrors(Map<String, String> result) {
		ResponseDTO errors = new ResponseDTO();
		result.forEach((key, value) -> {
		    //System.out.println("Clave: " + key + ", Valor: " + value)
		    if (key.chars().filter(ch -> ch == '.').count() > 0) {
		    	key = splitString(key);
			}
			errors.addEntry(key, "El campo " + value);
		});
		return errors;
	}
	
	public static String splitString(String s) {
		String[] arr = s.split("\\.");
		return new StringBuilder(Optional.ofNullable(arr[(arr.length-2)]).orElse(""))
				.append("_")
				.append(Optional.ofNullable(arr[(arr.length-1)]).orElse("")).toString();
	}

}
