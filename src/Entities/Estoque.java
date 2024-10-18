package Entities;

public class Estoque {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque(){
        return  preco * quantidade;
    }

    public void adicionarProduto( int quantidade){
        this.quantidade += quantidade;

    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "Dados do Produto: "
                + nome
                + ","
                + "$ "
                + String.format("%.2f", preco)
                + ","
                + quantidade
                +  " unidades, total:"
                + String.format("%.2f",valorTotalEstoque());
    }
}
