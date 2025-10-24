package aula11.exemplosPOO.exemplo02;

public class Principal {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.fabricante = "bic";
    c1.quantidadeTinta = 100;
    c1.cor = "branca";
    for (int i = 0; i < 120; i++) {
      if(c1.escrever("Texto a ser escrito")){
        System.out.println(" [ok]");
      }
      else{
        System.out.println("Acabou a tinta");
      }

    }
  }
}
