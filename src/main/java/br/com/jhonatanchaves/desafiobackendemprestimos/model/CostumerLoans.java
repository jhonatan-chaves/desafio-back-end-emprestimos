package br.com.jhonatanchaves.desafiobackendemprestimos.model;

public  class CostumerLoans {
	
	
	private int idade;
	private String nome;		
	private String cpf;
	private float renda;
	private String cidade;
	
	public CostumerLoans () {
		
	}
	
	
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	@Override
	public String toString() {
		return "CostumerLoans [idade=" + idade + ", nome=" + nome + ", cpf=" + cpf + ", renda=" + renda + ", cidade="
				+ cidade + "]";
	}
	
	
	

}
