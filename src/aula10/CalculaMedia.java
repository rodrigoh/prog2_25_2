package aula10;

import java.util.Scanner;

public class CalculaMedia {

  public static float leNota(int numero) {
    float nota;
    do {
      System.out.printf("Digite a %dº nota: ", numero);
      nota = new Scanner(System.in).nextFloat();
      if (nota < 0 || nota > 10)
        System.out.println("Nota inválida, ela precisa estar entre 0 e 10");
    }
    while (nota < 0 || nota > 10);
    return nota;
  }

  public static float calculaMedia(float[] notas) {
    float soma = 0;
    for (float nota : notas)
      soma += nota;
    return soma / notas.length;
  }

  public static void main(String[] args) {
    float[] notas = new float[3];
    for (int i = 0; i < notas.length; i++) {
      notas[i] = leNota(i + 1);
    }

    float media = calculaMedia(notas);
    System.out.printf("A média do aluno é %.3f\n", media);
  }
}
