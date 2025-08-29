package aula04;

import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        if(numero==0){
            System.out.println("O número é zero");
        }
        else if(numero>0){
            System.out.println("Número positivo");
        }
        else{
            System.out.println("Número negativo");
        }
    }
}
