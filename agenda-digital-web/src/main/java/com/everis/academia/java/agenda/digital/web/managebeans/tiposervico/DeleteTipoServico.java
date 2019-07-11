package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name="deleteTipoServico")
@Component("deleteTipoServico")
@RequestScope
public class DeleteTipoServico {

		@Autowired
		private ITipoServicoBusiness businesstipo;
		
		private TipoServico tiposervico = new TipoServico();

		public TipoServico getTiposervico() {
			return tiposervico;
		}

		public void setTiposervico(TipoServico tiposervico) {
			this.tiposervico = tiposervico;
		}
		
		public void removeTipoServico() throws BusinessException {
			
			
			businesstipo.deleteTipoServico(tiposervico);
			
			
			
		}
			
			
			
}
		


