package fila;

public class Programa_Fila{

    public static void main(String[] args){
        Fila fila = new Fila();

        fila.inserir("PE");
        fila.inserir("SP");
        fila.inserir("RJ");
        fila.inserir("MG");
        fila.inserir("BA");
        //criando while para mostar o tamanho, próximo e remoção
        while (fila.getTamanho() > 0){
            System.out.println("Tamanho: " + fila.getTamanho());
            System.out.println("Próximo: " + fila.get());
            System.out.println(">> Iniciando a remoção <<");
            fila.remover();
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
}