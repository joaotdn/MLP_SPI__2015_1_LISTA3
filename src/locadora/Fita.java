package locadora;

public abstract class Fita {
	private String nome;
	protected double preco;
	private boolean locacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	abstract void setPreco(double preco);

	public boolean isLocacao() {
		return locacao;
	}

	public void setLocacao(boolean locacao) {
		this.locacao = locacao;
	}
}
