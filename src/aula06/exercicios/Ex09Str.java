package aula06.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Leia uma sequência qualquer de 10 caracteres, armazene em um vetor, depois,
 * leia outro caractere do teclado, e conte quantas vezes ele aparece no vetor
 */
public class Ex09Str {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String palavra = ler.next().toUpperCase();
    char[] vetor = palavra.toCharArray();
    System.out.println("Letras: ");
    for (int i = 0; i < vetor.length; i++) {
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
