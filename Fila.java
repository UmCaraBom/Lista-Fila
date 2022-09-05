package fila;

public class Fila{

    private ListaLigada lista;
    public Fila(){
        this.lista = new ListaLigada();
    }


    public void inserir(String novoValor){
        this.lista.inserir(novoValor); 
        
    }
    public void remover(){
        this.lista.remover(this.get());
    }
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
    public int getTamanho(){
        return this.lista.getTamanho();
    }
}