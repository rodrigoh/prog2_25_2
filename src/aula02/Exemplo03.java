package aula02;

public class Exemplo03 {
	public static void main(String[] args){
		int numero = 10;
		//numero = numero + 1
		System.out.println("O valor de número é "+(numero++));
		System.out.println("O valor de número é "+(numero));

		numero = 10;
		System.out.println("O valor de número é "+(++numero));
		System.out.println("O valor de número é "+(numero));
	}
}
