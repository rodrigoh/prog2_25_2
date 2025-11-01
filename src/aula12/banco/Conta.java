package aula12.banco;

import java.util.Random;

public class Conta {
  String titular;
  String identificador;
  float saldo;
  String senha;

  Conta(){
    saldo = 0;
    geraIdentificador();
  }

  Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    geraIdentificador();
    saldo = 0;
  }

  void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "";
    for (int i = 0; i < 4; i++)
      identificador+=(char)aleatorio.nextInt(65,90);
    identificador+=aleatorio.nextInt(10000, 99999);
  }

  void depositar(float valor){
    saldo+=valor;
  }

  boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  boolean validaAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

  String mostraDados(){
    String dados = "Titular: "+titular;
    dados+="\nIdentificador: "+identificador;
    dados+="\nSaldo: "+String.format("R$ %.2f",saldo);
    return dados;
  }

  String saldo(){
    return String.format("Seu saldo é de R$ %.2f",saldo);
  }
}
