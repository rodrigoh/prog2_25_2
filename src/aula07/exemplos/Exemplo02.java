package aula07.exemplos;

public class Exemplo02 {
  public static void main(String[] args) {
    int[] vetor = {1,2,3,4,5,6,7,8};
    //declarando e inicializando uma matriz
    int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    //descobrindo o tamanho da matriz
    System.out.println("Quantas linhas tem a matriz: "+matriz.length);
    System.out.println("Quantas colunas tem a matriz: "+matriz[0].length);
    //mostrando a matriz na tela
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        System.out.printf("%02d ",matriz[l][c]);
      }
      System.out.println();
    }
    //Relembrando o for simplificado
    System.out.println("Vetor de exemplo");
    for(int i : vetor){
      System.out.print(i+" ");
    }
    //Usando o for simplificado para mostrar uma matriz
    System.out.println("\nDados na matriz usando o for simplificado");
    for(int[] linha : matriz){
      for(int coluna : linha){
        System.out.printf("%02d ",coluna);
      }
      System.out.println();
    }



  }
}
