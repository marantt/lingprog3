package business;

public class Carro extends Veiculo {

	private int quantidadePortas;

	public Carro(String modelo, String fabricante, int ano) {
		super(modelo, fabricante, ano);
	}
	
	public Carro() {
		super();
	}
	
	@Override
	public void acelerar() {
		velocidadeAtual += 10;
		
		if (this.velocidadeAtual >= 180) {
			this.velocidadeAtual = 180;
		}
		System.out.println("Acelerando o carro. Velocidade atual " + this.velocidadeAtual);
	}

	@Override
	public void desacelerar() {
		// TODO Auto-generated method stub
		this.velocidadeAtual -= 10;
		
		if (this.velocidadeAtual <= 0) {
			this.velocidadeAtual = 0;
		}
		System.out.println("Desacelerando o carro. Velocidade atual " + this.velocidadeAtual);
	}
	
	
}

