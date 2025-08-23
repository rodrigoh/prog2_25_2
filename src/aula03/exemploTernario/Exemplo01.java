package aula03.exemploTernario;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		System.out.println("Numero "+numero+" é positivo? "+(numero>0?"Sim":"Não"));
	}
}
