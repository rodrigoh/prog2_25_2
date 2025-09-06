package aula04;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int i = 10;
        while(i<10){
            System.out.print(i+" ");
            i++;
        }

        i = 10;
        do{
            System.out.print(i+" ");
            i++;
        }
        while(i<10);
        System.out.println("\nExemplo validar nota: ");
        float nota;
        do{
            System.out.print("Digite uma nota: ");
            nota = new Scanner(System.in).nextFloat();
        }
        while (nota<0 || nota>10);
    }
}
