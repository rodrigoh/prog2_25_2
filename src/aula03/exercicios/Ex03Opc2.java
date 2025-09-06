package aula03.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
 */
public class Ex03Opc2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float soma = 0;
		System.out.print("Digite a primeira nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a terceira nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a quarta nota: ");
		soma+= ler.nextFloat();
		float media = soma/4;
		//%.<ncasas>f
		System.out.printf("A média é %.2f\n",media);
	}
}
