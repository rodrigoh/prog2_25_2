package aula02.exemplo;

public class Exemplo01 {
	public static void main(String[] args){
		//Imprimindo na tela
		System.out.println("Mensagem a ser impressa na tela");
		System.out.printf("Mensagem a ser escrita com printf ");
		System.out.printf("Para quebrar linha usamos \n");
		//Declarando variáveis
		//Número inteiro
		int numero = 10;
		//Número float
		float valorReal = (float) 12.5;
		double valorDouble = 14.5644554;
		//Armazenando letras, para letras usamos aspas simples
		char letra = 'a';
		//Armazenar textos
		String frase = "Aula de programação de computadores";
		//Impressão das variáveis na tela
		System.out.println("Número inteiro vale "+numero);
		System.out.println("A variável real é "+valorReal);
		System.out.println("O valor da variável double é "+valorDouble);
		System.out.println("O valor da variável letra é "+letra);
		System.out.println("A frase é "+frase);
		System.out.println("Número = "+numero+" valor = "+valorReal);
		System.out.println("\nImprimindo as variáveis com printf");
		System.out.printf("Número inteiro vale %d\n",numero);
		System.out.printf("A variável real é %f\n",valorReal);
		//Limitar o número de casas decimais %.<ncasas>f
		System.out.printf("O valor da variável double é %.3f\n",valorDouble);
		System.out.printf("O valor da variável letra é %c",letra);
		System.out.printf("A frase é %s\n",frase);
		System.out.printf("Número = %d valor = %f\n",numero,valorReal);
		System.out.print("\t Tabulação");
	}
}
