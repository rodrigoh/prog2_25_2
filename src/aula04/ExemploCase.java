package aula04;

import java.util.Scanner;

public class ExemploCase {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = ler.next().toLowerCase().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("A letra é a");
                System.out.println("...");
                break;
            case 'b':
                System.out.println("A letra é b");
                break;
            case 'c':
                System.out.println("A letra é c");
                break;
            default:
                System.out.println("A letra não é a, b ou c");
        }
        //Nova sintaxe o switch case
        switch (letra){
            case 'a'-> {
                System.out.println("A letra é a");
                System.out.println("...");
            }
            case 'b'->System.out.println("A letra é b");
            case 'c'->System.out.println("A letra é c");
            default -> System.out.println("A letra não é a, b ou c");
        }
        //Mesmo exemplo com if
        if(letra=='a'){
            System.out.println("A letra é a");
            System.out.println("...");
        }
        else if(letra=='b')
            System.out.println("A letra é b");
        else if(letra=='c')
            System.out.println("A letra é c");
        else
            System.out.println("A letra não é a, b ou c");
    }
}
