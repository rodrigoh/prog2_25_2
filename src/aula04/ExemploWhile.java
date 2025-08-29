package aula04;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            System.out.print(i+" ");
            i++;
            //i=i+1
            //i+=1
        }
        i=10;
        System.out.println("\nOutro exemplo de while");
        while(i>=0){
            System.out.print(i+" ");
            i--;
        }
        System.out.print("Digite uma nota entre 1 e 10: ");
        float nota = new Scanner(System.in).nextFloat();
        while(nota<0 || nota>10){
            System.out.print("Digite uma nota entre 1 e 10: ");
            nota = new Scanner(System.in).nextFloat();
        }
        System.out.println("A nota digitada foi "+nota);
    }
}
