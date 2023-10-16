package Set.Ordenacao;

import java.util.Comparator;


public class Produto implements Comparable<Produto> {

    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Produto p) {
        return this.nome.compareTo(p.getNome());
    }

}

class ProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}

