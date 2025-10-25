package aula12.banco;

public class Conta {
  String titular;
  String identificador;
  float saldo;

  Conta(){
    saldo = 0;
  }

  Conta(String titular, String identificador){
    this.titular = titular;
    this.identificador = identificador;
    saldo = 0;
  }

  Conta(String titular, String identificador, float saldoInicial){
    this.titular = titular;
    this.identificador = identificador;
    saldo = saldoInicial;
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
