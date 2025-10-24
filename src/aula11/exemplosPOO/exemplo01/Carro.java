package aula11.exemplosPOO.exemplo01;

public class Carro {
  String marca;
  String modelo;
  String cor;
  int km;
  int anoFabricacao;

  void obterInformacoes(){
    System.out.println("Marca: "+marca);
    System.out.println("Modelo: "+modelo);
    System.out.println("Cor: "+cor);
    System.out.println("Km: "+km);
    System.out.println("Ano fabricação: "+anoFabricacao);
  }

  void andar(){
    System.out.println(modelo+" está andando...");
  }

  boolean parar(){
    System.out.println(modelo+" está parado");
    return true;
  }

}
