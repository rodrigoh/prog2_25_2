package aula05.exemplos;

import java.util.Random;

public class Exemplo02 {
  public static void main(String[] args) {
    Random aleatorio = new Random();
    //nextInt() -> gera números altos
    //nextInt(limiteSuperior) -> gerar um número aleatório de 0 até limite
    //nextInt(limiteInferior, limiteSuperior) -> gera um número aleatório entre os limites
    int numero = aleatorio.nextInt(10,100);
    System.out.println("Número inteiro aleatório: "+numero);
    //Float aleatório
    float numF = aleatorio.nextFloat();
    System.out.println("Número real aleatório: "+numF);
    //Boolean aleatório
    boolean valor = aleatorio.nextBoolean();
    System.out.println("Agora saiu "+valor);
  }
}
