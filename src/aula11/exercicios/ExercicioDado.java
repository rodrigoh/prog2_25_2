package aula11.exercicios;

import java.util.Random;

public class ExercicioDado {

  public static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6);
  }

  public static void main(String[] args) {
    int[] sorteio = new int[6];
    int maxLancamentos = 1000_000;
    for (int i=0;i<maxLancamentos;i++){
      int valor = dado();
      sorteio[valor]++;
    }

    for (int i = 0; i < sorteio.length ; i++) {
      float percentual = sorteio[i]/(float)maxLancamentos*100;
      System.out.printf("A face %d do dado saiu %d x o que corresponde a %.2f %%\n",i+1, sorteio[i],percentual);
    }
  }
}
