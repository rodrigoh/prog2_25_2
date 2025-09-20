package aula07.exercicios;

import java.util.Scanner;

/*
Ler 6 números inteiros para preencher uma matriz D 2x3, ou seja, com 2 linhas e 3 colunas
(considere que não serão informados valores duplicados). A seguir, ler um número inteiro X
e escrever uma mensagem indicando se o valor de X existe ou não na matriz D.
 */
public class Ex01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[][] matrizD = new int[2][3];
    for (int l = 0; l < matrizD.length; l++) {
      for (int c = 0; c < matrizD[l].length; c++) {
        System.out.print("matrizD["+l+"]["+c+"]: ");
        matrizD[l][c] = ler.nextInt();
      }
    }
    //Ler o número para pesquisar na matriz
    System.out.print("Qual número devo pesquisar na matriz: ");
    int numero = ler.nextInt();
    //Pesquisando...
    boolean achei = false;
    for(int[] linha:matrizD){
      for(int coluna:linha){
        if(numero==coluna){
          achei = true;
        }
      }
    }
    if(achei){
      System.out.println("O número "+numero+" está na matrizD");
    }
    else{
      System.out.println("O número "+numero+" não está na matrizD");
    }
  }
}
