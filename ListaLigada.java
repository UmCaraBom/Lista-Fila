package fila;

public class ListaLigada{
    private Ponto primeiro;
    private Ponto ultimo;
    private int tamanho;

    //criando construtor (funcionaria sem)
    public ListaLigada(){
      this.tamanho = 0; 
    }

    //criando getters e setters
    public Ponto getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(Ponto primeiro){
        this.primeiro = primeiro;
    }
    public Ponto getUltimo(){
        return ultimo;
    }
    public void setUltimo(Ponto ultimo){
        this.ultimo = ultimo;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    //criando método para inserir valor na lista
    public void inserir(String novoValor){
        Ponto novoPonto = new Ponto(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoPonto;
            this.ultimo = novoPonto;
            this.tamanho++;  
        }
        else{
            this.ultimo.setProximo(novoPonto);
            this.ultimo = novoPonto;
            this.tamanho++;
        }
    }
    //criando método para remover valor da lista
    public void remover(String novoValor){
        Ponto anterior = null;
        Ponto atual = this.primeiro;
        while (atual != null) {
            if (atual.getValor().equals(novoValor)) {
                if (anterior == null) {
                    this.primeiro = atual.getProximo();
                }
                else {
                    anterior.setProximo(atual.getProximo());
                }
                this.tamanho--;
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    //criando método para achar o valor pelo indice na lista
    public Ponto get(int posicao){
        Ponto atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}