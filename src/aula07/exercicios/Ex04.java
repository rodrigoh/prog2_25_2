package aula07.exercicios;

import java.util.Random;

/*
Leia uma matriz de 5x5 elementos.
Calcule a soma dos elementos que estão na diagonal principal.
Calcule a soma dos elementos que estão acima da diagonal principal.
Calcule a soma dos elementos que estão abaixo da diagonal principal.
 */
public class Ex04 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    int somaD = 0;
    int somaAbaixo = 0;
    int somaAcima = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        //Gerar valores para matriz
        matriz[l][c] = aleatorio.nextInt(1,50);
        System.out.printf("%02d ",matriz[l][c]);
        //realizando as somas
        if(l==c)
          somaD+=matriz[l][c];
        else if(l<c)
          somaAcima+=matriz[l][c];
        else
          somaAbaixo+=matriz[l][c];
      }
      System.out.println();
    }
    System.out.println("A soma dos elementos");
    System.out.println("Na diagonal principal vale "+somaD);
    System.out.println("Acima da diagonal principal vale "+somaAcima);
    System.out.println("Abaixo da diagonal principal vale "+somaAbaixo);
  }
}
