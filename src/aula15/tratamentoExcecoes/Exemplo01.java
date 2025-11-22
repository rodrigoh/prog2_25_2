package aula15.tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    try {
      System.out.print("Digite um número: ");
      int n1 = ler.nextInt();
      System.out.print("Digite outro número: ");
      int n2 = ler.nextInt();
      int resposta = n1 / n2;
      System.out.println(n1 + "/" + n2 + "=" + resposta);
    }
    //Podemos ter vários blocos de catch, um para cada tipo de Exceção
    catch (InputMismatchException e){
      System.out.println("Os valores de n1 e n2 precisam ser números");
    }
    catch (ArithmeticException e){
      System.out.println("não é possível dividir por zero");
    }
    //O bloco finally sempre é executado
    finally {
      System.out.println("Sempre será executado");
    }

    System.out.println("Todo o resto do código...");
  }
}
