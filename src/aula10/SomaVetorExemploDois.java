package aula10;

import java.util.Random;

/**
 * Crie um programa que gere números aleatórios para um vetor de 10 elementos e crie um
 * método para calcular e devolver a soma dos elementos de um vetor. Devolver o resultado
 * para o programa principal.
 */
public class SomaVetorExemploDois {

  public static int soma(int[] vetor){
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma+=vetor[i];
    }
    return soma;
  }
  //Quando passamos um vetor como parâmetro para um método Java, ele cria um "link" (ponteiro) entre o vetor do método
  // principal e o vetor do método geraVetor
  public static void geraVetor(int[] lista){
    Random aleatorio = new Random();
    //Gerando valores para o vetor....
    for(int i=0;i<lista.length;i++) {
      lista[i] = aleatorio.nextInt(1, 20);
    }
  }

  public static void main(String[] args) {
    int[] lista = new int[10];
    geraVetor(lista);
    //Mostrando o vetor....
    for(int i=0;i<lista.length;i++){
      System.out.print(lista[i]+" ");
    }
    int resultado = soma(lista);
    System.out.println("\nA soma dos elementos do vetor vale "+resultado);
  }
}
