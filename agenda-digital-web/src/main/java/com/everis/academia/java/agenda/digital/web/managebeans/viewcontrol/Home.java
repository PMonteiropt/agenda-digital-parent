package com.everis.academia.java.agenda.digital.web.managebeans.viewcontrol;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.agenda.digital.entity.Cidade;
import com.everis.academia.agenda.digital.entity.PrestadorServico;
import com.everis.academia.agenda.digital.entity.TipoServico;

@ManagedBean(name = "HomeJSF")
@Component("HomeJSF")
@RequestScope
public class Home {

	private Cidade cidade = new Cidade();

	private PrestadorServico prestador = new PrestadorServico();

	private TipoServico tiposervico = new TipoServico();

	public Cidade getCidade() {
		return cidade;

	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public TipoServico getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}

	public String directCidade(Cidade cidade) {
		
	 this.cidade=cidade;
		
		return "Create";
	
	}
	public String directPrestador(PrestadorServico prestador) {
		
		this.prestador=prestador;
		
		return"createprestador";
	}
	public String directTipoServico(TipoServico tiposervico) {
		
		this.tiposervico=tiposervico;
		
		return "createtiposervico";
		
		
	}

}
	