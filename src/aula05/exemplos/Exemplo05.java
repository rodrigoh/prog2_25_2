package aula05.exemplos;

import java.util.Scanner;

public class Exemplo05 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[100];
    int cont = 0;
    char opc;
    do{
      System.out.print("Digite um número: ");
      vetor[cont++] = ler.nextInt();
      System.out.print("Tem mais números (s - sim n - não): ");
      opc = ler.next().toLowerCase().charAt(0);
    }
    while(opc=='s');
    System.out.println("Números digitados:");
    for(int i=0;i<cont;i++){
      System.out.print(vetor[i]+" ");
    }
  }
}
