package aula05.exemplos;

import java.util.Random;

public class Exemplo03CopiaVetor {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] v1 = new int[10];

    System.out.println("Dados no v1:");
    for (int i = 0; i < v1.length; i++) {
      v1[i] = aleatorio.nextInt(10,50);
      System.out.print(v1[i]+" ");
    }
    //Declarando um v2 com a mesma capacidade de v1
    int[] v2 = new int[v1.length];
    //Copia manual
    for (int i = 0; i < v1.length; i++) {
      v2[i] = v1[i];
    }
    //Copia usando o método arrayCopy
    //arrayCopy(origem, posicaoInicialOrigem, destino, posicaoInicalDestino, quantElementosCopiar)
    System.arraycopy(v1,0,v2,0,10);

    System.out.println("\nDados no v2");
    for(int i=0;i<v2.length;i++){
      System.out.print(v2[i]+" ");
    }

    v2[2] = 99;

    System.out.println("\nDados no v1");
    for(int i=0;i<v1.length;i++){
      System.out.print(v1[i]+" ");
    }

    System.out.println("\nDados no v2");
    for(int i=0;i<v2.length;i++){
      System.out.print(v2[i]+" ");
    }
  }
}
