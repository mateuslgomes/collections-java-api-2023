package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinho.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        double preco = 0.0;
        for (Item item : carrinho) {
            preco = preco + (item.getPreco() * item.getQuantidade());
        }
        return preco;
    }

    public void exibirItens() {
        System.out.println("Carrinho: " + carrinho.toString());
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Maçã", 1.3, 3);
        carrinhoDeCompras.adicionarItem("Pera", 1.6, 5);
        carrinhoDeCompras.adicionarItem("Abobora", 7.5, 1);
        carrinhoDeCompras.adicionarItem("Feijao 1KG", 5.6, 3);
        carrinhoDeCompras.adicionarItem("Cenora", 0.8, 7);
        carrinhoDeCompras.adicionarItem("Arroz 5KG", 22.0, 2);

        carrinhoDeCompras.exibirItens();
        System.out.printf("Preço: R$ " + "%.2f", carrinhoDeCompras.calcularValorTotal());
        System.out.println();

        carrinhoDeCompras.removerItem("maça");
        carrinhoDeCompras.removerItem("arroz 5kg");
        carrinhoDeCompras.removerItem("cenora");
        carrinhoDeCompras.removerItem("pera");
        System.out.println();

        carrinhoDeCompras.exibirItens();
        System.out.printf("Preço: R$ " + "%.2f", carrinhoDeCompras.calcularValorTotal());

    }

}
