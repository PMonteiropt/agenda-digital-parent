package com.everis.academia.java.agenda.digital.web.managebeans.prestador;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.impl.PrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;

@ManagedBean(name="createPrestador")
public class CreatePrestadorJSF {

		private String enumprestador;

	
	
		private IPrestadorServicoBusiness businessprestador = new PrestadorServicoBusiness();
		
		private PrestadorServico prestadorservico = new PrestadorServico();

		public PrestadorServico getPrestadorservico() {
			return prestadorservico;
		}

		public void setPrestadorservico(PrestadorServico prestadorservico) {
			this.prestadorservico = prestadorservico;
		}
		
		public String returnEnum() {
			
			
			
			return enumprestador;
		}
		
		
		public String criarPrestadorServico() throws BusinessException {
			
			businessprestador.createPrestador(prestadorservico);
			
			
			return "readtiposervico";
		}


}
