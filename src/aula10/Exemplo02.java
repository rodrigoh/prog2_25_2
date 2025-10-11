package aula10;

import java.util.Scanner;

public class Exemplo02 {
    //Em prog estruturada Variável global em POO é um atributo de classe
    //Ela vai existir enquanto o código estiver rodando e será acessível em todos os métodos (funções) da classe
    public static Scanner lerValor = new Scanner(System.in);

    //t é uma variável global ou atributo de classe
    public static int t;

    public static String leString(String mensagem){
        System.out.print(mensagem+": ");
        return lerValor.nextLine();
    }

    public static int leNumero(){
        System.out.print("Digite um número: ");
        return new Scanner(System.in).nextInt();
    }

    //As variáveis n1, n2 e resultado tem escopo local ou são variáveis de método.
    public static int soma(int n1, int n2){
        int resultado = n1+n2;
        return resultado;
    }

    public static void main(String[] args) {
        int n1 = leNumero();
        int n2 = leNumero();
        System.out.println(soma(n1,n2));
        //i =e uma variável local (escopo e tempo de vida o for)
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //j é uma variável local com escopo do método main
        int j;
        for(j=0;j<10;j++)
            System.out.print(j+" ");
        System.out.println();

        //t é uma variável global com escopo da classe
        for(t=0;t<10;t++)
            System.out.print(t+" ");
    }
}
