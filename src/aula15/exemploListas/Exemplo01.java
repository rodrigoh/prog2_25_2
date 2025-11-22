package aula15.exemploListas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Exemplo01 {
  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>(10);
    lista.add("Elemento 1");
    lista.add("Elemento 2");
    lista.add("Elemento 3");
    lista.add("Elemento 4");
    lista.add("Elemento 5");
    lista.add("Elemento 6");
    lista.add("Elemento 7");
    lista.add("Elemento 8");
    lista.add("Elemento 9");
    lista.add("Elemento 10");
    System.out.println(lista);
    System.out.println("A lista contém o 'Elemento 9'? "+lista.contains("Elemento 9"));
    System.out.println("Removendo o elemento da posição 1 "+lista.remove(1));
    System.out.println("Removendo o elemento 'Elemento 4' da lista "+lista.remove("Elemento 4"));
    lista.add(4,"Elemento novo");
    System.out.println(lista);
    System.out.println("Qual a posição do 'Elemento 10' na lista "+lista.indexOf("Elemento 10"));
    HashMap<Integer, String> mapa = new HashMap<>();
    mapa.put(1, "Exemplo");
    mapa.put(2, "Teste");
    System.out.println(mapa);
    mapa.put(1,"Aula");
    System.out.println(mapa);


  }
}
