package avaliaçãoG1;

import java.util.Random;

public class QuestaoOito {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int[] vx = new int[10];
    int[] vy = new int[10];
    int[] vr = new int[20];
    System.out.println("Dados no vetor x");
    for (int i = 0; i < vx.length; i++) {
      vx[i] = aleatorio.nextInt(10, 30);
      System.out.print(vx[i] + " ");
    }
    System.out.println("\nDados no vetor y");
    for (int i = 0; i < vy.length; i++) {
      vy[i] = aleatorio.nextInt(30, 50);
      System.out.print(vy[i] + " ");
    }
    System.out.println("\nDados no vetor R");
    //posições impares = vx
    //posições pares = vy
    int ix = 0;
    int iy = 0;
    for (int i = 0; i < vr.length; i++) {
      if (i % 2 == 0) {
        vr[i] = vy[iy];
        iy++;
      } else {
        vr[i] = vx[ix];
        ix++;
      }
      System.out.print(vr[i] + " ");
    }
  }
}
