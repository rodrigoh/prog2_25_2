package aula03.exercicios;

import java.util.Scanner;

/**
 * Faça um programa em Java que calcule a área de um círculo
 */
public class Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o valor do raio: ");
		float raio = ler.nextFloat();
		//Math.pow(base, expoente)
		double area = Math.PI * Math.pow(raio,2);
		//double area = Math.PI * raio * raio;
		System.out.printf("A área do círculo de raio %.2f vale %.2f\n",raio,area);

	}
}
