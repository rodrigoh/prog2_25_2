package aula02;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args){
		//Declarando uma instância da classe Scanner
		Scanner ler = new Scanner(System.in);
		//Lendo um número inteiro
		System.out.print("Digite um número inteiro: ");
		int numero = ler.nextInt();
		System.out.println("O número inteiro digitado foi "+numero);
		//Lendo um número float
		System.out.print("Digite um número real: ");
		float valor = ler.nextFloat();
		System.out.printf("O valor real é %.2f\n",valor);
		//Lendo uma String do teclado
		System.out.print("Qual seu nome: ");
		String nome = ler.next();
		System.out.println("Bem vindo "+nome);
		//Lendo apenas uma letra
		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		System.out.println("A letra é "+letra);

	}
}
