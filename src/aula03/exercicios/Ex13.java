package aula03.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu
 * carro na praça. Sabendo-se que o preço do combustível é
 * de R$ 6,15, escreva um programa para ler: a marcação do
 * odômetro (Km) no início do dia, a marcação (Km) no
 * final do dia, o número de litros de combustível gasto e
 * o valor total (R$) recebido dos passageiros. Calcular e
 * escrever: a média do consumo em Km/L e o lucro (líquido)
 * do dia.
 */
public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km inicial: ");
		int kmInicial = ler.nextInt();
		System.out.print("Qual a km final: ");
		int kmFinal = ler.nextInt();
		System.out.print("Quantos litros de combustível foram abastecidos: ");
		float quantLitros = ler.nextFloat();
		System.out.print("Qual o valor total recebido: ");
		float valorRecebido = ler.nextFloat();
		float autonomia = (kmFinal-kmInicial)/quantLitros;
		double lucro = valorRecebido - (quantLitros* 6.15);
		System.out.printf("A autonomia do carro é %.2f km/l\n",autonomia);
		System.out.printf("Seu lucro é de R$%.2f\n",lucro);
	}
}
