package aula15.exemploInterface;

public class Pilha implements Estrutura{
  private String[] elementos;
  private int tamanho;

  public Pilha(int capacidade){
    elementos = new String[capacidade];
    tamanho = 0;
  }
  @Override
  public void adiciona(String elemento) {
    elementos[tamanho] = elemento;
    tamanho++;
  }

  @Override
  public String remove() {
    String elemento = elementos[tamanho-1];
    tamanho--;
    return elemento;
  }

  public int getTamanho(){
    return tamanho;
  }
}
