package veiculos;

public class VeiculoDePasseio extends Veiculo {
	private boolean arCondicionado;
	private int qtdDePertas;

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getQtdDePertas() {
		return qtdDePertas;
	}

	public void setQtdDePertas(int qtdDePertas) {
		this.qtdDePertas = qtdDePertas;
	}

}
