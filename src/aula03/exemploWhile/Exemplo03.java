package aula03.exemploWhile;

import java.util.Scanner;

public class Exemplo03 {
	public static void main(String[] args) {
		//Leia um número do teclado e mostrar a tabuada do número
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número de 1 a 10: ");
		int num = ler.nextInt();
		while(num<1 || num>10){
			System.out.print("Eu disse entre 1 e 10: ");
			num = ler.nextInt();
		}
		int i = 1;
		while(i<=10){
			int mult = i*num;
			System.out.printf("%d x %d = %d\n",i,num,mult);
			i++;
		}
	}
}
