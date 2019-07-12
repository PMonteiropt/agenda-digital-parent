package com.everis.academia.agenda.digital.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.everis.academia.agenda.digital.enums.TipoLogradouro;

@Entity
@Table(name="TB_PRESTADOR_SERVICO", schema="public")
@SequenceGenerator(name="SQ_PRESTADOR_SERVICO", sequenceName="SQ_PRESTADOR_SERVICO",initialValue=1,allocationSize=1)
public class PrestadorServico implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(generator="SQ_PRESTADOR_SERVICO", strategy=GenerationType.SEQUENCE)
	@Column(name="COD_PRESTADOR_SERVICO")
	private Integer codigo;
	
	@Column(name="NOME_PRESTADOR", nullable = false, unique=false)
	private String nome;
	

	private Cidade cidade;
	
	
	private String bairro;
	
	
	private String cep;
	
	
	private TipoLogradouro tipoLogradouro;
	
	
	private String logradouro;
	
	
	private String complemento;
	
	
	private String numero;
	
	
	private String email;
	
	@Transient
	private Set<Telefone> telefone;
	
	@Transient
	private Set<TipoServico> servicosCredenciados;
	
	@Transient
	private Set<PrestacaoServico> prestacoesServicos;
	
	
 	

	
	
	public PrestadorServico() {
		super();
		
	}

	public PrestadorServico(Integer codigo) {
		this();
		this.codigo = codigo;
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Set<TipoServico> getServicosCredenciados() {
		return servicosCredenciados;
	}

	public void setServicosCredenciados(Set<TipoServico> servicosCredenciados) {
		this.servicosCredenciados = servicosCredenciados;
	}

	public Set<PrestacaoServico> getPrestacoesServicos() {
		return prestacoesServicos;
	}

	public void setPrestacoesServicos(Set<PrestacaoServico> prestacoesServicos) {
		this.prestacoesServicos = prestacoesServicos;
	}
	
	
	





}	

