package com.everis.academia.java.agenda.digital.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.everis.academia.agenda.digital.entity.TipoServico;

@FacesConverter(value = "ConverterTipoServico", forClass = TipoServico.class)
public class ConverterTipoServico implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		TipoServico tiposervico=null;
		
		if(value !=null && !value.trim().isEmpty()) {
			
			tiposervico = new TipoServico(Short.valueOf(value.trim()));
		}
		return tiposervico;
		
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value instanceof TipoServico) {
			
			return String.valueOf(((TipoServico)value).getCodigo());
		}
		return (String) value;
	}

}
