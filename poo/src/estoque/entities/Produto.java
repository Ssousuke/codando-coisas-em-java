package estoque.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    // Veja que o atributo da classe se chama "quantidade" e o agumento do método também se chama "quantidade"
    // para diferenciar usamos o "this" para referênciar o atribudo da classe
    public void adicionaProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", preco: " + preco + ", quantidade: " + quantidade;
    }
}
