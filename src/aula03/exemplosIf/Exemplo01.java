package aula03.exemplosIf;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		//Operadores relacionais
		// > maior que
		// < menor que
		// >= maior ou igual a
		// <= menor ou igual a
		// != diferente
		// == comparação de igualdade
		//Operadores lógicos
		// || OU lógico
		// && E lógico
		// ! Não lógico
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		if(numero==0)
			System.out.println("Número é zero");
		else if(numero>0)
			System.out.println("O número "+numero+" é positivo");
		else
			System.out.println("O número "+numero+" é negativo");
	}
}
