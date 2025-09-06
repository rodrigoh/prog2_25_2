package aula03.exemplosCase;

import java.util.Scanner;

public class Exemplo01If {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um dia da semana (1-7): ");
		int dia = ler.nextInt();
		if(dia==1){
			System.out.println("O dia é domingo");
			System.out.println("...");
		}
		else if(dia==2){
			System.out.println("O dia é segunda feira");
		}
		else if(dia==3){
			System.out.println("O dia é terça feira");
		}
		else if(dia==4){
			System.out.println("O dia é quarta feira");
		}
		else if(dia==5){
			System.out.println("O dia é quinta feira");
		}
		else if(dia==6){
			System.out.println("O dia é sexta feira");
		}
		else if(dia==7){
			System.out.println("O dia é sábado");
		}
		else{
			System.out.println("O número "+dia+" não corresponde a nenhum dia");
		}
//		switch (dia){
//			case 1:
//				System.out.println("O dia é domingo");
//				System.out.println("...");
//				break;
//			case 2:
//				System.out.println("O dia é segunda feira");
//				break;
//			case 3:
//				System.out.println("O dia é terça feira");
//				break;
//			case 4:
//				System.out.println("O dia é quarta feira");
//				break;
//			case 5:
//				System.out.println("O dia é quinta feira");
//				break;
//			case 6:
//				System.out.println("O dia é sexta feira");
//				break;
//			case 7:
//				System.out.println("O dia é sábado");
//				break;
//				//Opcional equivale ao else do if
//			default:
//				System.out.println("O número "+dia+" não corresponde a nenhum dia");
//		}
	}
}
