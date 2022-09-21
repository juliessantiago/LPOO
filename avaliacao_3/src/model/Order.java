package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Order {
    private int numero;
    private GregorianCalendar data;
    private double valor;

    Seller seller;
    //Atenção: alteração na multiplicidade de item

    List<Item> itemList = new ArrayList<>();

    public Order(int numero, GregorianCalendar data, Seller seller, List<Item> itemList){
        this.numero = numero;
        this.data = data;
        this.seller = seller;
        this.itemList = itemList;

        itemList.forEach(item ->
            this.valor = item.getTotalItem() + this.valor
        );
    }

    private static String convertData(GregorianCalendar data) {
        if(data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            return sdf.format(data.getTime());
        }
        return "00/00/0000";
    }


    @Override
    public String toString() {
        return "\nPedido{" +
                "\nnumero=" + numero +
                "\ndata=" + convertData(data) +
                "\nvalor total dessa venda=" + valor +
                "\nvendedor=" + seller.getNome() +
                "\n------------------------------"+
                "\nitens dessa venda=" + itemList +
                "\n------------------------------\n"+
                '}';
    }


}
