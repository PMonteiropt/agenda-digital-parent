package com.everis.academia.java.agenda.digital.web.managebeans.tiposervico;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.business.interfaces.ITipoServicoBusiness;

@ManagedBean(name = "readTipoServico")
@Component("readTipoServico")
@RequestScope
public class ReadTipoServico {

	@Autowired
	private ITipoServicoBusiness businesstipo;

	public List<TipoServico> getServicos() {
		
		return businesstipo.readTipoServico();

	}
}
