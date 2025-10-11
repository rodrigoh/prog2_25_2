package aula10.exercicios;

import java.util.Scanner;

public class EquacaoDoisGrau {

  public static double calculaDelta(double a, double b, double c){
    //return Math.pow(b,2) - 4 * 1 * c;
    return b * b - 4 * a * c;
  }

  public static double calculaX(double a, double b, double d, char opc){
    double x;
    if(opc=='+'){
      x = (-b+Math.sqrt(d))/(2*a);
    }
    else{
      x = (-b-Math.sqrt(d))/(2*a);
    }
    return x;
  }

  public static double leNumero(String mensagem){
    Scanner ler = new Scanner(System.in);
    System.out.print(mensagem+": ");
    return ler.nextDouble();
  }

  public static void main(String[] args) {
    System.out.println("Dada a equação ax² + bx + c = 0, informe:");
    double a = leNumero("a");
    double b = leNumero("b");
    double c = leNumero("c");
    double delta = calculaDelta(a,b,c);
    if(delta>=0){
      double x1 = calculaX(a,b,delta,'+');
      double x2 = calculaX(a,b,delta,'-');
      System.out.println("As raízes da equação são");
      System.out.printf("x': %.3f\n",x1);
      System.out.printf("x'': %.3f\n",x2);
    }
    else{
      System.out.println("A equação não possui raízes no conjunto dos reais");
    }
  }
}
