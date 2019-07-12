package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name = "readPrestador")
@Component("readPrestador")
@RequestScope
public class ReadPrestadorServico {


	@Autowired
	private IPrestadorServicoBusiness businessprestador;
	
	public List<PrestadorServico> getPrestadores() {
		
		
		return businessprestador.read();
		
		
	}
	
		
}
