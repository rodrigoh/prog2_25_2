package aula03.exemplosIf;

import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senhaValida = "a123456";
		System.out.print("Digite sua senha: ");
		String senha = ler.next();
		//Sempre que precisar comparar objetos, temos que usar o equals
		if(senha.equals(senhaValida))
			System.out.println("Bem vindo admin");
		else
			System.out.println("Senha incorreta");
	}
}
