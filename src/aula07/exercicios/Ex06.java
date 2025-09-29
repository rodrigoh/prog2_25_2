package aula07.exercicios;

import java.util.Random;

public class Ex06 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[][] cartela = new int[5][5];
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length;) {
        int numero = aleatorio.nextInt(1,100);
        //Verificando se o número existe na matriz
        boolean numeroNovo = true;
        for (int i = 0; i < l; i++) {
          for (int j = 0; j < cartela[l].length; j++) {
            if(numero==cartela[i][j])
              numeroNovo = false;
          }
        }
        //Se o número for "novo"
        if(numeroNovo){
          cartela[l][c] = numero;
          c++;
        }
      }
    }
    //Mostrando a cartela
    for (int l = 0; l < cartela.length; l++) {
      for (int c = 0; c < cartela[l].length; c++) {
        System.out.printf("%02d ",cartela[l][c]);
      }
      System.out.println();
    }
  }
}
