package aula06.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma sequência qualquer de 10 caracteres, armazene em um vetor, depois,
 * leia outro caractere do teclado, e conte quantas vezes ele aparece no vetor
 */
public class Ex09 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    char[] vetor = new char[10];
    System.out.println("Letras aleatórias: ");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = (char) aleatorio.nextInt(65,90);
      System.out.print(vetor[i]);
    }
    System.out.print("\nQual letra devo pesquisar: ");
    char letra = new Scanner(System.in).next().toUpperCase().charAt(0);
    int cont = 0;
    for (int i = 0; i < vetor.length; i++) {
      if(vetor[i]==letra)
        cont++;
    }
    System.out.println("A letra "+letra+" aparece "+cont+" vezes na lista de letras");
  }
}
