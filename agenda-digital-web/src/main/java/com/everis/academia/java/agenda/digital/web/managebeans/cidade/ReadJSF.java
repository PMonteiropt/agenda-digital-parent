package com.everis.academia.java.agenda.digital.web.managebeans.cidade;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.business.interfaces.ICidadeBusiness;

@ManagedBean(name = "read")
@Component("read")
@RequestScope
public class ReadJSF {

	@Autowired
	private ICidadeBusiness business;

	public List<Cidade> getCidades() {
		return business.read();
	}

}
