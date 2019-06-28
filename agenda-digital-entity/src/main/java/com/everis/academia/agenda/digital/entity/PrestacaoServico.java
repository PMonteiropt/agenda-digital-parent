package com.everis.academia.agenda.digital.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class PrestacaoServico {

	private Integer codigo;
	private String nome;
	private Date data;
	private PrestadorServico prestador;
	
	Set<ServicoPrestado> servico = new HashSet<ServicoPrestado>();
	


}
