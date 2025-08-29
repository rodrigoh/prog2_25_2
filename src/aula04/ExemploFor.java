package aula04;

public class ExemploFor {
    public static void main(String[] args) {
        //for(inicialização; teste; passo)
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
        }

        System.out.println("\nPodemos omitir a inicialização");
        int j = 10;
        for(;j>=0;j--)
            System.out.print(j+" ");
        System.out.println("\nRemovendo o passo");
        for(int i=0;i<=10;){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\nUsando mais de uma variável");
        for(int i=0,t=9;i<10 && t>=0;i++,t--){
            System.out.println("i= "+i+" t= "+t);
        }

    }
}
