package aula11.exemplosPOO.exemplo01;

public class Principal {
  public static void main(String[] args) {
    //NomeObjeto nomeInstancia = new NomeObjeto()
    Carro carroUm = new Carro();
    //Definindo os valores dos atributos
    carroUm.marca = "vw";
    carroUm.modelo = "fusca";
    carroUm.cor = "azul";
    carroUm.km = 85989;
    carroUm.anoFabricacao = 1980;
    //Acessando os atributos
    System.out.println("Marca: "+carroUm.marca);
    System.out.println("Modelo: "+carroUm.modelo);
    System.out.println("Cor: "+carroUm.cor);
    System.out.println("Km: "+carroUm.km);
    System.out.println("Ano fabricação: "+carroUm.anoFabricacao);

    //Criando outra instância
    Carro carroDois = new Carro();
    carroDois.marca = "Fiat";
    carroDois.modelo = "500";
    carroDois.cor = "vermelho";
    carroDois.km = 95333;
    carroDois.anoFabricacao = 1965;
    System.out.println("Marca: "+carroDois.marca);
    System.out.println("Modelo: "+carroDois.modelo);
    System.out.println("Cor: "+carroDois.cor);
    System.out.println("Km: "+carroDois.km);
    System.out.println("Ano fabricação: "+carroDois.anoFabricacao);

    //Chamando os métodos da classe
    carroUm.obterInformacoes();
    carroUm.andar();
    carroUm.parar();


  }
}
