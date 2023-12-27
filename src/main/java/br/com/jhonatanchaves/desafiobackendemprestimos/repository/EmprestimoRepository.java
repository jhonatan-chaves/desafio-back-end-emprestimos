package br.com.jhonatanchaves.desafiobackendemprestimos.repository;

import br.com.jhonatanchaves.desafiobackendemprestimos.model.EmprestimoModel;

public class EmprestimoRepository implements ITipoEmprestimo {

	EmprestimoModel emprestimoPessoal = new EmprestimoModel();
	EmprestimoModel emprestimoConsignado = new EmprestimoModel();
	EmprestimoModel emprestimoGarantia = new EmprestimoModel();

	@Override
	public EmprestimoModel emPessoal() {

		emprestimoPessoal.setTipo(ETipoEmprestimo.PESSOAL);
		emprestimoPessoal.setTaxaJuros(4);

		return emprestimoPessoal;
	}

	@Override
	public EmprestimoModel emConsignado() {
		emprestimoConsignado.setTipo(ETipoEmprestimo.CONSIGNADO);
		emprestimoConsignado.setTaxaJuros(2);
		return emprestimoConsignado;
	}

	@Override
	public EmprestimoModel emGarantia() {
		emprestimoGarantia.setTipo(ETipoEmprestimo.COMGARANTIA);
		emprestimoGarantia.setTaxaJuros(3);
		return emprestimoGarantia;
	}

}
