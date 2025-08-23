package aula03.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que leia a altura e o peso de uma
 * pessoa e calcule seu IMC IMC = peso/altura²
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual sua altura em metros: ");
		float altura = ler.nextFloat();
		System.out.print("Qual seu peso em kg: ");
		float peso = ler.nextFloat();
		float imc = peso/(altura*altura);
		System.out.printf("Seu IMC = %.3f\n",imc);
		System.out.println("Seu IMC = "+imc);
	}
}
