package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Supply { //Fornecimento
    private GregorianCalendar data;
    private double valorTotal;//Esse valor é o total gasto nesse fornecimento

    private int qntdComprada; //Não existe na modelagem, criei para melhor entendimento

    Dealer dealer;
    Product product;

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int qntdComprada,double valorTotal) {
        this.valorTotal = qntdComprada * product.getPrecoCusto();
    }

    public int getQntdComprada() {
        return qntdComprada;
    }

    public void setQntdComprada(int qntdComprada) {
        this.qntdComprada = qntdComprada;
    }


    private static String convertData(GregorianCalendar data) {
        if(data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            return sdf.format(data.getTime());
        }
        return "00/00/0000";
    }

    public Supply(GregorianCalendar data, int qntdComprada, Dealer dealer, Product product) {
        this.data = data;
        this.qntdComprada = qntdComprada;
        this.dealer = dealer;
        this.product = product;
        //se um novo fornecimento é feito, é feita a relação entre fornecedor e produto
        product.dealer = this.dealer;
        dealer.addToTheList(this.product);
        //é preciso alterar a quantidade em estoque do produto
        product.increaseStock(this.qntdComprada);
        //é calculado o custo desse fornecimento
        setValorTotal(this.qntdComprada, product.getPrecoCusto());
    }



    /*--------------------ToString----------------------------------*/

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "\ndata=" + convertData(data) +
                ",\nvalor total do fornecimento=" + valorTotal +
                ",\nquantidade comprada=" + qntdComprada + " unidades" +
                ",\nfornecedor=" + dealer +
                ",\nproduto=" + product +
                '}'+ "\n=====" +
                "==============================================";
    }
}


