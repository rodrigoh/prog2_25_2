package aula03.exemplosCase;

import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		switch (letra){
			case 'a','e','i','o','u'-> System.out.println("É vogal");
			default -> System.out.println("É consoante");
		}
	}
}
