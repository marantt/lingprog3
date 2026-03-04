package model;

public class Divisao extends Calculo {

	public Divisao(float valor1, float valor2, float resultado) {
		super(valor1, valor2, resultado);
	}
	
	@Override
	public void calcular() {
		this.resultado = this.getValor1() / this.getValor2();
	}
}
