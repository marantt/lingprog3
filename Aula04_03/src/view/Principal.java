package view;
import java.util.Scanner;

import business.Carro;
import business.Moto;
import business.Veiculo;

public class Principal {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("1- Carro");
		System.out.println("2- Moto");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		
			case 1 -> {
				
				Carro veiculo = new Carro();
				controlarVeiculo(veiculo);
				break;
				
			}
			
			case 2 -> {
				Moto veiculo = new Moto();
				controlarVeiculo(veiculo);
				break;
				
			}
			
			default -> {
				System.out.println("Meu piru");
				
			}
		
		};

	}
	
	
	
	public static void controlarVeiculo(Veiculo v) {
		int op;
		do {
			System.out.println("1- Acelerar");
			System.out.println("2- Desacelerar");
			System.out.println("3- Parar");
			op = entrada.nextInt();
			
			
			switch (op) {
				case 1:
					v.acelerar();
					break;
				case 2:
					v.desacelerar();
					break;
				case 3:
					v.parar();
					break;
				default:
					System.out.println("Finalizando programa.");
			};
			
			
		} while(op == 1 || op == 2 || op == 3);
		
	}
	
		

}

