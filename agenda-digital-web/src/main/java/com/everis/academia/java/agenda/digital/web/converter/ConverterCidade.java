package com.everis.academia.java.agenda.digital.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.everis.academia.agenda.digital.entity.Cidade;

@FacesConverter(value = "ConverterCidade", forClass = Cidade.class)
public class ConverterCidade implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		Cidade cidade=null;
		
		if(value !=null && !value.trim().isEmpty()) {
			
			cidade= new Cidade(Short.valueOf(value.trim()));
		}
		
		return cidade;
	
	}

	public String getAsString(FacesContext context,UIComponent component, Object value) {
	
	
		if(value instanceof Cidade ) {
			
			return String.valueOf(((Cidade) value).getCodigo());
		}
		
		return(String) value;
	}

}
