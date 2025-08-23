package aula03.exemplosCase;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um dia da semana (1-7): ");
		int dia = ler.nextInt();
		switch (dia){
			case 1-> System.out.println("É domingo");
			case 2-> System.out.println("É segunda feira");
			case 3-> System.out.println("É terça feira");
			case 4->{
				System.out.println("É quarta feira");
				System.out.println("...");
			}
			case 5-> System.out.println("É quinta feira");
			case 6-> System.out.println("É sexta feira");
			case 7-> System.out.println("É sábado");
			default -> System.out.println("O número não corresponde a nenhum dia");
		}
	}
}
