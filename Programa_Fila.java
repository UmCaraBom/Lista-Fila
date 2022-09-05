package fila;

public class Programa_Fila{

    public static void main(String[] args){
        Fila fila = new Fila();

        fila.inserir("João");	
        fila.inserir("Maria");
        fila.inserir("Railson");
        fila.inserir("José");
        fila.inserir("Marta");
        fila.inserir("Pedro");
        fila.inserir("Paulo");
        fila.inserir("Ana");
        fila.inserir("Joana");
        fila.inserir("Rafaela");
        fila.inserir("Gustavo");
        fila.inserir("Augusto");
        fila.inserir("pelé");
        fila.inserir("Ronaldo");
        fila.inserir("Garrincha");
        //criando while para mostar o tamanho, próximo e remoção
        System.out.println("primeiro: " + fila.get());

        while (fila.getTamanho() > 0){
            System.out.println("Tamanho atual >> " + fila.getTamanho());
            System.out.println("Próximo: " + fila.get());
            if (fila.getTamanho() > 0){
                    System.out.println(">> Iniciando a remoção <<");
                    fila.remover();}
            if (fila.getTamanho() == 0){
                    System.out.println("Ainda faltam: "+ fila.getTamanho());
                    System.out.println(">> FIM DA FILA<<");}
         }   
    } 
}  



        /*System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("Primeiro: " + fila.get());
        fila.remover();
        System.out.println("Próximo: " + fila.get());
        fila.remover();
        System.out.println("Próximo: " + fila.get());
        //imprimir tamanho da fila
        System.out.println("Tamanho: " + fila.getTamanho());
        
        
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("Próximo da fila: " + fila.get());
        System.out.println(">> Iniciando a remoção <<");
        fila.remover();
        System.out.println("Tamanho: " + fila.getTamanho());
        System.out.println("Próximo da fila: " + fila.get());
        System.out.println(">> Iniciando a remoção <<");
        fila.remover();
        System.out.println("Tamanho atual: " + fila.getTamanho());
        System.out.println("Próximo da fila: " + fila.get());


        */
