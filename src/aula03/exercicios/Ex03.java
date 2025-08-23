package aula03.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1;
		float n2;
		float n3;
		float n4;
		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.print("Digite a terceira nota: ");
		n3 = ler.nextFloat();
		System.out.print("Digite a quarta nota: ");
		n4 = ler.nextFloat();
		float media = (n1+n2+n3+n4)/4;
		//%.<ncasas>f
		System.out.printf("A média é %.2f\n",media);
	}
}
