package aula10;

import java.util.Scanner;

public class Exemplo01 {
    //Função para somar dois números e devolver o resultado
    //tipo_acesso static tipo_retorno (void se nenhum) nome_funcao(parâmetros - opcionais)
    public static int soma(int n1, int n2){
        int resultado = n1+n2;
        return resultado;
    }
    //Função tem o objetivo de ler um número inteiro do teclado
    public static int leNumero(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextInt();
    }

    //Função para ler uma String do teclado
    public static String leString(String mensagem){
        System.out.print(mensagem+": ");
        return new Scanner(System.in).nextLine();
    }

    //Função para somar (concatenar) duas Strings e mostrar elas na tela
    public static void soma(String p1, String p2){
        System.out.println(p1+" "+p2);
    }


    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        System.out.print("Digite um valor para v1: ");
//        int v1 = ler.nextInt();
//        System.out.print("Digite um valor para v2: ");
//        int v2 = ler.nextInt();
        int v1 = leNumero("Digite o valor para v1");
        int v2 = leNumero("Digite um valor para v2");

        int resultado = soma(v1,v2);
        System.out.print("A função soma retornou "+resultado);

        String nome = leString("\nQual seu nome");
        String sobrenome = leString("Qual seu sobrenome");
        soma(nome,sobrenome);
    }
}
