package aula03.exercicios;

import java.util.Scanner;

/*
Escreva um programa que leia o nome e o sobrenome de uma pessoa
separadamente e mostre uma mensagem, “Bem vindo Nome Sobrenome”.
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = ler.next();
		System.out.printf("Bem vindo %s %s\n",nome,sobrenome);
		System.out.println("Bem vindo "+nome+" "+sobrenome);
	}
}
