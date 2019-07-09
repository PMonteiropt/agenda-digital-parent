package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import javax.faces.bean.ManagedBean;

import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.impl.PrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name="deleteTipoServico")
public class DeleteTipoServico {

		ITipoServicoBusiness businesstipo = new TipoServicoBusiness();
		
		private TipoServico tiposervico = new TipoServico();

		public TipoServico getTiposervico() {
			return tiposervico;
		}

		public void setTiposervico(TipoServico tiposervico) {
			this.tiposervico = tiposervico;
		}
		
		public void removeTipoServico() {
			
			
			businesstipo.deleteTipoServico(tiposervico);
			
			
			
		}
			
			
			
}
		


