package aula04;

import java.util.Scanner;

public class ExemploIfDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String usuario = ler.next();
        System.out.print("Digite sua senha: ");
        String senha = ler.next();
        if(usuario.equals("admin") && senha.equals("123456")){
            System.out.println("Bem vindo "+usuario+"!");
        }
        else{
            System.out.println("Usuário ou senha inválidos");
        }
    }
}
