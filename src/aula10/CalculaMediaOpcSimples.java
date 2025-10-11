package aula10;

import java.util.Scanner;

public class CalculaMediaOpcSimples {

    public static float leNota(int numero){
        float nota;
        do {
            System.out.printf("Digite a %dº nota: ", numero);
            nota = new Scanner(System.in).nextFloat();
            if(nota<0 || nota>10)
                System.out.println("Nota inválida, ela precisa estar entre 0 e 10");
        }
        while(nota<0 || nota>10);
        return nota;
    }

    public static float calculaMedia(float n1, float n2, float n3){
        return (n1+n2+n3)/3;
    }

    public static void main(String[] args) {
        float notaUm = leNota(1);
        float notaDois = leNota(2);
        float notaTres = leNota(3);
        float media = calculaMedia(notaUm,notaDois,notaTres);
        System.out.printf("A média do aluno é %.3f\n",media);
    }
}
