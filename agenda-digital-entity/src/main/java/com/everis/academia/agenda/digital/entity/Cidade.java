package com.everis.academia.agenda.digital.entity;

public class Cidade {

	private Short codigo;
	private String nome;
	

	
 	public Cidade() {
		super();
	}	
	
 	
 	
	//???
	public Cidade(Short codigo) {
		super();
		this.codigo = codigo;
	}

	


	public Cidade(Short codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}



	public Short getCodigo() {
		return codigo;
	}
	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	
	
	
	
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	


	
	}
	
	
	
	


