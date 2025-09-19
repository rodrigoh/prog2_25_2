package aula06.exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia uma lista de até 10 salários, a cada salário lido o
 * programa deve perguntar se o usuário gostaria de continuar a leitura, caso
 * responda Sim, o programa deve ler mais um salário, até o limite de 10.
 * Ao final ler o percentual de reajuste dos salários, reajustar e mostrar
 * os novos valores.
 */
public class Ex10 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float[] salarios = new float[10];
    String opc = "sim";
    int cont;
    for (cont = 0; cont < salarios.length && opc.equals("sim"); cont++) {
      System.out.print("Qual o "+(cont+1)+"° salário: ");
      salarios[cont] = ler.nextFloat();
      System.out.print("Tem mais salários (sim / não): ");
      opc = ler.next().toLowerCase();
    }
    System.out.print("Qual o percentual de reajuste: ");
    float percentual = ler.nextFloat();
    System.out.println("Salários atualizados: ");
    for (int i = 0; i < cont; i++) {
      salarios[i] = salarios[i]*(1+percentual/100);
      System.out.printf("R$ %.2f\n",salarios[i]);
    }
  }
}
