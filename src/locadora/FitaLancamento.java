package locadora;

public class FitaLancamento extends Fita {
	
	public void setPreco(double preco) {
		this.preco = preco + (preco * 0.2);
	}
	
}
