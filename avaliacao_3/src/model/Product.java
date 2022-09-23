package model;

import java.util.ArrayList;
import java.util.List;

public class Product { //Produto, representação do estoque
    private int codigo;
    private String nome;
    private int qntdEstoque; //Renomeação
    //precoCusto representa o valor a ser pago ao fornecedor por unidade
    //na prática, considero que o mais correto é o precoCusto vir no Fornecimento
    private double precoCusto; //Renomeação
    private double precoVenda; //Alteração

    private int qntdComprada; //Alteração

    private boolean stockChangeError;

    Dealer dealer;

    //ligação entre Produto e Item
    List<Item> itemList = new ArrayList<>();

    /*---------------------Getters and Setters-------------------*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStock() {
        return qntdEstoque;
    }

    public boolean stockChangeError() {
        return stockChangeError;
    }

    public void increaseStock(int qntdComprada) {
        this.qntdEstoque = qntdEstoque + qntdComprada;

    }

    public void decreaseStock(int qntdVendida){

        if(this.qntdEstoque - qntdVendida >= 0){
            this.qntdEstoque = qntdEstoque - qntdVendida;
            System.out.println("Feita retirada no estoque!");
        }else{
            this.stockChangeError = true;
           // System.out.println("\nQuantidade insuficiente em estoque");
        }



    }


    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda() {
        this.precoVenda = precoCusto * 0.10 + precoCusto;
    }



    /*--------------------Construtor sem Item e sem fornecedor, assim como sem precoVenda (será calculado depois)--------------------*/

    public Product(int codigo, String nome, int qntdEstoque, double precoCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.qntdEstoque = qntdEstoque;
        this.precoCusto = precoCusto;

        this.setPrecoVenda();
    }

    /*-------------------------toString-------------------------------------*/

    @Override
    public String toString() {
        return "\nProduto{" +
                "\ncodigo=" + codigo +
                "\nnome='" + nome + '\'' +
                "\nquantidade em estoque=" + qntdEstoque +
                "\npreco de custo=" + precoCusto +
                "\npreco de venda=" + precoVenda +
                //retirei daqui o fornecedor por problema de stack over flow
                '}';
    }
}
