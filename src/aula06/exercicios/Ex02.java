package aula06.exercicios;

import java.util.Random;

/**
 * Declarar três vetores A, B e C de 10 elementos. Gerar números aleatórios para os
 * vetores A e B. O vetor C deve receber a soma dos elementos do vetor A com o vetor B.
 * Mostrar os três vetores
 */
public class Ex02 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] va = new int[10];
    int[] vb = new int[10];
    int[] vc = new int[10];
    System.out.println("va[x] + bv[x] = vc[x]");
    for (int i = 0; i < va.length; i++) {
      va[i] = aleatorio.nextInt(1,50);
      vb[i] = aleatorio.nextInt(1,50);
      vc[i] = va[i] + vb[i];
      System.out.println(va[i]+" + "+vb[i]+" = "+vc[i]);
    }
  }
}
