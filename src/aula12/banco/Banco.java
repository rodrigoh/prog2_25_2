package aula12.banco;

import java.util.Scanner;

public class Banco {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Conta[] lista = new Conta[10];
    int cont=0;
    char menuP;
    do{
      System.out.println("Selecione uma opção do menu");
      System.out.println("c - cadastrar uma conta");
      System.out.println("a - acessar uma conta");
      System.out.println("s - sair");
      menuP = ler.next().toLowerCase().charAt(0);
      switch (menuP){
        case 'c'-> {
          if (cont < lista.length){
            System.out.println("Cadastro de conta");
            System.out.print("Qual seu nome: ");
            String nome = ler.next();
            System.out.print("Qual a senha para conta: ");
            String senha = ler.next();
            lista[cont] = new Conta(nome, senha);
            System.out.println("Conta cadastrada obteve o identificador " + lista[cont].identificador);
            cont++;
          }
          else
            System.out.println("O banco está cheio.");
        }
        case 'a'->{
          System.out.print("Qual o identificador da conta: ");
          String identificador = ler.next();
          System.out.print("Qual a senha: ");
          String senha = ler.next();
          //Verificando se existe uma conta com estas informações
          int posicao = -1;
          for (int i = 0; i < cont; i++) {
            if(lista[i].validaAcesso(identificador,senha))
              posicao = i;
          }
          //Acessando a conta
          if(posicao>=0){
            char menuI;
            do{
              System.out.println("Bem vindo "+lista[posicao].titular);
              System.out.println("Acessando a conta "+lista[posicao].identificador);
              System.out.println("Selecione uma opção");
              System.out.println("d - depositar");
              System.out.println("s - sacar");
              System.out.println("v - verificar saldo");
              System.out.println("e - retornar ao menu principal");
              menuI = ler.next().toLowerCase().charAt(0);
              switch (menuI){
                case 'd'->{
                  System.out.print("Informe o valor do deposito: ");
                  float valor = ler.nextFloat();
                  lista[posicao].depositar(valor);
                  System.out.println("Deposito realizado com sucesso!");
                }
                case 's'->{
                  System.out.print("Informe o valor do saque: ");
                  float valor = ler.nextFloat();
                  if(lista[posicao].sacar(valor)){
                    System.out.printf("Saque de R$%.2f realizado\n",valor);
                  }
                  else{
                    System.out.println("Saldo insuficiente.");
                  }
                }
                case 'v'->{
                  System.out.println(lista[posicao].mostraDados());
                }
              }
            }
            while (menuI!='e');
          }
          else{
            System.out.println("Dados de acesso inválidos");
          }
        }
      }
    }
    while(menuP!='s');
  }
}