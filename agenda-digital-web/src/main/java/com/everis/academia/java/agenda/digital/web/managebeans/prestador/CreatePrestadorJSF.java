package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.enums.TipoLogradouro;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name="createPrestadores")
@Component("createPrestadores")
@RequestScope
public class CreatePrestadorJSF {

		

	
		@Autowired
		private IPrestadorServicoBusiness businessprestador;
		
		private PrestadorServico prestador = new PrestadorServico();

		public PrestadorServico getPrestadorservico() {
			return prestador;
		}

		public void setPrestadorservico(PrestadorServico prestador) {
			this.prestador = prestador;
		}
		
		
		
		
		public TipoLogradouro[] returnEnum() {
			
			
			return TipoLogradouro.values();
			
		}
		
		
		public String criarPrestadorServico() throws BusinessException {
			
			businessprestador.createPrestador(prestador);
			
			
			return "readtiposervico";
		}


}
