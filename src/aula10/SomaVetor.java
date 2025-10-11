package aula10;

import java.util.Random;

/**
 * Crie um programa que gere números aleatórios para um vetor de 10 elementos e crie um
 * método para calcular e devolver a soma dos elementos de um vetor. Devolver o resultado
 * para o programa principal.
 */
public class SomaVetor {

  public static int soma(int[] vetor){
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma+=vetor[i];
    }
    return soma;
  }

  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] lista = new int[10];
    //Gerando valores para o vetor....
    for(int i=0;i<lista.length;i++){
      lista[i] = aleatorio.nextInt(1,20);
      System.out.print(lista[i]+" ");
    }
    int resultado = soma(lista);
    System.out.println("\nA soma dos elementos do vetor vale "+resultado);
  }
}
