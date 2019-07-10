package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.enums.TipoLogradouro;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name="createPrestador")
@Component("createPrestador")
@RequestScope
public class CreatePrestadorJSF {

		

	
		@Autowired
		private IPrestadorServicoBusiness businessprestador;
		
		private PrestadorServico prestadorservico = new PrestadorServico();

		public PrestadorServico getPrestadorservico() {
			return prestadorservico;
		}

		public void setPrestadorservico(PrestadorServico prestadorservico) {
			this.prestadorservico = prestadorservico;
		}
		
		
		
		
		public TipoLogradouro[] returnEnum() {
			
			
			return TipoLogradouro.values();
			
		}
		
		
		public String criarPrestadorServico() throws BusinessException {
			
			businessprestador.createPrestador(prestadorservico);
			
			
			return "readtiposervico";
		}


}
