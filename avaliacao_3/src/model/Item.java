package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;

    private double totalItem;//alteração

    Product product;

    public Item() {
    }

    public void setTotalItem(int quantidade, double valor) {
        this.totalItem = quantidade * valor;
    }

    public double getTotalItem() {
        return totalItem;
    }

    /*----------------------Construtor com produto------------------------*/
    //Não achei necessário utilizar o desconto
    public Item(int codItem, int quantidade, Product product) {
        double valorProduto = product.getPrecoVenda();
        this.codItem = codItem;
        this.quantidade = quantidade;
        this.product = product;

        this.product.decreaseStock(this.quantidade);
        this.setTotalItem(this.quantidade, valorProduto);
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "\ncodItem=" + codItem +
                "\nquantidade=" + quantidade +
                "\ntotal desse item=" + totalItem +
                "\nproduto=" + product +
                '}';
    }
}
