package view;

import java.util.Scanner;
import model.Calculo;
import model.Adicao;
import model.Subtracao;
import model.Multiplicacao;
import model.Divisao;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a operacao desejada:");
		System.out.println("1 - Adicao.");
		System.out.println("2 - Subtracao.");
		System.out.println("3 - Multiplicacao.");
		System.out.println("4 - Divisao.");
		System.out.print("Escolha: ");
		int op = sc.nextInt();

		System.out.print("Digite o primeiro numero: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
		float valor2 = sc.nextFloat();

		Calculo calc = null;
		switch (op) {
			case 1:
				calc = new Adicao(valor1, valor2, 0);
				break;
			case 2:
				calc = new Subtracao(valor1, valor2, 0);
				break;
			case 3:
				calc = new Multiplicacao(valor1, valor2, 0);
				break;
			case 4:
				calc = new Divisao(valor1, valor2, 0);
				break;
			default:
				System.out.println("Você digitou uma opcao invalida. Por favor verifique!");
				sc.close();
				return;
		}

		calc.calcular();
		System.out.println("Resultado: " + calc.getResultado());
		sc.close();
	}

}
