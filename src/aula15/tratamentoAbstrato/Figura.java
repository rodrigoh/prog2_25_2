package aula15.tratamentoAbstrato;
//Classes abstratas são modelos a serem seguidos por outras classes (filhas)
public abstract class Figura {
  private String nomeFigura;

  public Figura(String nomeFigura){
    this.nomeFigura = nomeFigura;
  }

  public String getNomeFigura(){
    return nomeFigura;
  }

  public void setNomeFigura(String nomeFigura){
    this.nomeFigura = nomeFigura;
  }

  public abstract double calculaArea();

  public abstract double calculaPerimetro();
}
