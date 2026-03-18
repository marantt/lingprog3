package business;

public class Moto extends Veiculo {

	private boolean descansoAcionado;
	
	public Moto(String modelo, String fabricante, int ano) {
		super(modelo, fabricante, ano);
	}
	
	public Moto() {
		super();
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
		System.out.println("Acelerando a moto. Velocidade atual " + this.velocidadeAtual);
		
		this.descansoAcionado = false;
	}
	
	@Override
	public void desacelerar() {
		
		this.velocidadeAtual -= 5;
		
		if (velocidadeAtual <= 0) {
			descansoAcionado = true;
			this.velocidadeAtual = 0;
			this.descansoAcionado = true;
		}
		
		System.out.println("Desacelerando a moto. Velocidade atual " + this.velocidadeAtual);
	}
}

