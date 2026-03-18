package business;

public abstract class Veiculo {

	protected String modelo;
	protected String fabricante;
	protected int ano;
	protected float velocidadeAtual;
	
	public Veiculo(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
	}
	
	public Veiculo() {}
	
	public void acelerar() { 
		velocidadeAtual += 5;
		if (velocidadeAtual > 180) {
			velocidadeAtual = 180;
		}
	
	}
	public void desacelerar() { 
		velocidadeAtual -= 5; 
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void parar() { velocidadeAtual = 0;}
	
	@Override
	public String toString() {
		return String.format("Fabricante: %s, Ano: %d, Modelo: %s", fabricante, ano, modelo);
	}
}
