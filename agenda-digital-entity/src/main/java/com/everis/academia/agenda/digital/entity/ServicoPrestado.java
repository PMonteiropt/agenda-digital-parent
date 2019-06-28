package com.everis.academia.agenda.digital.entity;

public class ServicoPrestado {

		private PrestacaoServico prestacaoServico;
		private TipoServico tipoServico;
		private Double valor;
		
		
		public PrestacaoServico getPrestacaoServico() {
			return prestacaoServico;
		}
		public void setPrestacaoServico(PrestacaoServico prestacaoServico) {
			this.prestacaoServico = prestacaoServico;
		}
		public TipoServico getTipoServico() {
			return tipoServico;
		}
		public void setTipoServico(TipoServico tipoServico) {
			this.tipoServico = tipoServico;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		


}
