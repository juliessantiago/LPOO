package model;

import java.util.ArrayList;
import java.util.List;

public class Dealer { //Fornecedor
    private long cnpj; //alterei de int para long
    private String contato;
    private String nome;

    private List<Product> productList = new ArrayList<>();

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addToTheList(Product product){
        productList.add(product);
    }


    /*----------------------Construtor sem produto-----------------------*/

    public Dealer(long cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    /*--------------------------toString------------------------------------*/

    @Override
    public String toString() {
        return "\nFornecedor{" +
                "\ncnpj=" + cnpj +
                ",\ncontato='" + contato + '\'' +
                ",\nnome='" + nome + '\'' +"}";
    }
}
