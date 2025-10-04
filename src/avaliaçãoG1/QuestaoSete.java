package avaliaçãoG1;

public class QuestaoSete {
  public static void main(String[] args) {
    int[][] matriz = {{3, 5, 6},{5, 2, 4},{6, 4, 8}};
    boolean simetrica = true;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if(matriz[i][j]!=matriz[j][i])
          simetrica = false;
      }
    }
    if(simetrica){
      System.out.println("A matriz:");
      for(int[] linha : matriz){
        for(int c:linha)
          System.out.printf("%02d ",c);
        System.out.println();
      }
      System.out.println("É simétrica");
    }
    else{
      System.out.println("A matriz:");
      for(int[] linha : matriz){
        for(int c:linha)
          System.out.printf("%02d ",c);
        System.out.println();
      }
      System.out.println("Não é simétrica");
    }
  }
}
