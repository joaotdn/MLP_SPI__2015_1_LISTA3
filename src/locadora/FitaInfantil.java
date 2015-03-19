package locadora;

public class FitaInfantil extends Fita {
	
	public void setPreco(double preco) {
		this.preco = preco + (preco * 0.4);
	}
	
}
