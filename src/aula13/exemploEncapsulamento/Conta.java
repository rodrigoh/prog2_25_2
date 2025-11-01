package aula13.exemploEncapsulamento;

import java.util.Random;

public class Conta {
  private String titular;
  private String identificador;
  private float saldo;
  private String senha;

  public Conta(){
    saldo = 0;
    geraIdentificador();
  }

  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    geraIdentificador();
    saldo = 0;
  }

  public String getIdentificador(){
    return identificador;
  }

  private void geraIdentificador(){
    Random aleatorio = new Random();
    identificador = "";
    for (int i = 0; i < 4; i++)
      identificador+=(char)aleatorio.nextInt(65,90);
    identificador+=aleatorio.nextInt(10000, 99999);
  }

  public void depositar(float valor){
    saldo+=valor;
  }

  public boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public boolean validaAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

  public String mostraDados(){
    String dados = "Titular: "+titular;
    dados+="\nIdentificador: "+identificador;
    dados+="\nSaldo: "+String.format("R$ %.2f",saldo);
    return dados;
  }

  public String saldo(){
    return String.format("Seu saldo é de R$ %.2f",saldo);
  }
}
