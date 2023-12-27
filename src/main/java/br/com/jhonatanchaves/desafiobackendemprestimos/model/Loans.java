package br.com.jhonatanchaves.desafiobackendemprestimos.model;

import java.util.List;

public class Loans {
	
	private String nome;
	
	private List<EmprestimoModel> lon;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<EmprestimoModel> getLon() {
		return lon;
	}

	public void setLon(List<EmprestimoModel> lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "Loans [nome=" + nome + ", lon=" + lon + "]";
	}
	
	
	
}
