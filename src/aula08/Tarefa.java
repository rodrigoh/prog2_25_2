package aula08;

import java.util.Random;

public class Tarefa {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    int tamanho = 100000;
    int[] vi = new int[tamanho];
    int[] vs = new int[tamanho];
    System.out.print("\nGerando os vetores de "+tamanho+" valores aleatórios ... ");
    for (int i = 0; i < tamanho; i++) {
      vi[i] = aleatorio.nextInt(1,tamanho*2);
      vs[i] = vi[i];
    }
    System.out.println("[ok]");
    if(tamanho<100){
      System.out.println("Dados no vetor:");
      for (int i : vi) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    //Implementando o selectionSort
    System.out.print("Ordenando "+tamanho+" elementos com o Selection Sort ... ");
    long tempoInicial = System.currentTimeMillis();
    for (int i = 0; i < vs.length-1; i++) {
      int min = i;
      for (int j = i+1; j < vs.length; j++) {
        if(vs[j]<vs[min]){
          min = j;
        }
      }
      if(min!=i){
        int aux = vs[i];
        vs[i] = vs[min];
        vs[min] = aux;
      }
    }
    //
    long tempoFinal = System.currentTimeMillis();
    long tempoSelection = tempoFinal-tempoInicial;
    System.out.println("[ok]");
    if(tamanho<100){
      System.out.println("Dados no vetor ordenado:");
      for (int i : vs) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    tempoInicial = System.currentTimeMillis();
    System.out.print("Ordenando "+tamanho+" elementos com o Insertion Sort ... ");
    //Implementando o insertionSort
    for (int i = 1; i < vi.length; i++) {
      int chave = vi[i];
      int j = i-1;
      while(j>=0 && vi[j] > chave){
        vi[j+1] = vi[j];
        j = j-1;
      }
      vi[j+1] = chave;
    }
    tempoFinal = System.currentTimeMillis();
    long tempoInsertion = tempoFinal-tempoInicial;
    System.out.print("[ok]");
    if(tamanho<100){
      System.out.println("\nDados no vetor ordenado:");
      for (int i : vi) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
    System.out.println("\nPara vetores de "+tamanho+" elementos");
    if(tempoSelection>1000){
      float tempoSegundos = (float) tempoSelection/1000;
      System.out.printf("O tempo de execução para o Selection Sort foi de %d ms, %.3fs\n",tempoSelection,tempoSegundos);
    }
    else
      System.out.println("O tempo de execução para o Selection Sort foi de "+tempoSelection+"ms");
    if(tempoInsertion>1000){
      float tempoSegundos = (float) tempoInsertion/1000;
      System.out.printf("O tempo de execução para o Insertion Sort foi de %d ms, %.3fs\n",tempoInsertion,tempoSegundos);
    }
    else
      System.out.println("O tempo de execução para o Insertion Sort foi de "+tempoInsertion+"ms");
  }
}
