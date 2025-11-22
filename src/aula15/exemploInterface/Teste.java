package aula15.exemploInterface;

public class Teste {
  public static void main(String[] args) {
    Pilha p1 = new Pilha(10);
    p1.adiciona("Elemento 1");
    p1.adiciona("Elemento 2");
    p1.adiciona("Elemento 3");
    p1.adiciona("Elemento n");
    System.out.println("O tamanho da pilha é "+p1.getTamanho());
    System.out.println("Removendo o elemento "+p1.remove());
    System.out.println("O tamanho da pilha é "+p1.getTamanho());

    Estrutura e1 = new Pilha(5);
    e1.adiciona("Teste");
    System.out.println(e1.remove());
    //System.out.println(e1.getTamanho());

  }
}
