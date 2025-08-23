package aula03.exemplosIf;

import java.util.Scanner;

/**
 * Leia três notas de um aluno e diga se ele está:
 * Aprovado média >=8
 * Recuperação média >=3 e <8
 * Reprovado se a média for menor que 3
 */
public class Exemplo02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = ler.nextFloat();
		System.out.print("Terceira nota: ");
		float n3 = ler.nextFloat();
		float media = (n1+n2+n3)/3;
		System.out.printf("Sua média é %.2f\n",media);
		if(media>=8){
			System.out.println("Você está aprovado");
		}
		else if(media>=3){
			System.out.println("Você está em recuperação");
		}
		else {
			System.out.println("Você está reprovado");
		}
	}
}
