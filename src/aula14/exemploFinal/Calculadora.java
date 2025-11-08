package aula14.exemploFinal;

public class Calculadora {
  //Quando criamos uma variável final ela não pode ter seu valor alterado
  final double valor;
  //O modificador final também é aplicado na declaração de constantes
  //pública para ter acesso global
  //estática para estar disponível sem criar instância
  //final para não ter o valor alterado
  public static final double PI = 3.14159265359;

  public Calculadora(){
    valor = 5.5;
  }


}
