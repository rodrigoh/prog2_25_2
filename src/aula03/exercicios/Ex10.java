package aula03.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que calcule a área e o perímetro
 * de um quadrado
 */
public class Ex10 {
	public static void main(String[] args) {
		float lado, area, perimetro;
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o valor do lado: ");
		lado = ler.nextFloat();
		area = lado*lado;
		perimetro = 4*lado;
		System.out.printf("O quadrado de lado %.2f tem área " +
						"%.2f un² e perímetro %.2f un\n",lado,area,perimetro);
	}
}
