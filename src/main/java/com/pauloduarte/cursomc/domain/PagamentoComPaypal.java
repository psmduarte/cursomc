package com.pauloduarte.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.pauloduarte.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComPaypal extends Pagamento {
	private static final long serialVersionUID=1L;
	
	private Date dataPagamento;
	private Date dataVendicimento;
	
	public PagamentoComPaypal() {
	}

	public PagamentoComPaypal(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento=dataPagamento;
		this.dataVendicimento=dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVendicimento() {
		return dataVendicimento;
	}

	public void setDataVendicimento(Date dataVendicimento) {
		this.dataVendicimento = dataVendicimento;
	}


	
}
