package br.com.jhonatanchaves.desafiobackendemprestimos.model;

import br.com.jhonatanchaves.desafiobackendemprestimos.repository.ETipoEmprestimo;

public class EmprestimoModel {

	private ETipoEmprestimo  tipo;
	private int taxaJuros;
	
	
	public ETipoEmprestimo getTipo() {
		return tipo;
	}
	public void setTipo(ETipoEmprestimo tipo) {
		this.tipo = tipo;
	}
	public int getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(int taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	@Override
	public String toString() {
		return "EmprestimoModel [tipo=" + tipo + ", taxaJuros=" + taxaJuros + "]";
	}

	
	

}
