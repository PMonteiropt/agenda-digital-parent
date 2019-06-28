package com.everis.academia.agenda.digital.entity;


import java.sql.Date;
import java.util.Set;

public class PrestacaoServico {

	private Integer codigo;
	private String nome;
	private Date data;
	private Set<ServicoPrestado> servicoPrestados;
	private PrestadorServico prestador;
	
	public PrestacaoServico() {
		super();
		
	}

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Set<ServicoPrestado> getServicoPrestados() {
		return servicoPrestados;
	}

	public void setServicoPrestados(Set<ServicoPrestado> servicoPrestados) {
		this.servicoPrestados = servicoPrestados;
	}


	public PrestadorServico getPrestador() {
		return prestador;
	}


	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}
	
	
}
