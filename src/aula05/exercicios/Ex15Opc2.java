package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler 2 números e escrever a soma dos inteiros existentes
 * entre os 2 números lidos (incluindo os números lidos na soma). Exemplo: Números
 * lidos: 2 e 5 Resultado: 2+3+4+5 = 14. Observação: Considere que o segundo valor
 * lido será sempre maior que o primeiro valor lido.
 */
public class Ex15Opc2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int n1 = ler.nextInt();
    int n2;
    do {
      System.out.print("Digite um número maior que " + n1 + ": ");
      n2 = ler.nextInt();
    }
    while(n2<=n1);
    int soma = 0;
    for(int i=n1;i<=n2;i++){
      soma+=i;
    }
    System.out.println("A soma dos números entre "+n1+" e "+n2+" vale "+soma);
  }
}
