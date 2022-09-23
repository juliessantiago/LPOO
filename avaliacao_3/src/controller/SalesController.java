package controller;

import model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class SalesController {
    public static void main(String[] args) {

        Dealer dealer1 = new Dealer(51182835000140L,"32288039", "Nova Safra");
        Dealer dealer2 = new Dealer(30486435000159L, "32254010", "Copal Distribuidora");
        Dealer dealer3 = new Dealer(54367266000104L, "30215577", "PMG Atacadista");
        Dealer dealer4 = new Dealer(58300545000101L, "3845577312", "Itambé Alimentos");

        //Decidi criar instâncias de Produto sem o valor de venda que será alterado depois
        Product product1 = new Product(1, "Arroz branco Tio João 5kg", 0, 25.00);
        Product product2 = new Product(2, "Leite UHT Integral Mu-Mu 1L", 0, 7.50);
        Product product3 = new Product(3, "Feijão Carioca Camil 1kg", 0, 8.00);
        Product product4 = new Product(4, "Macarrão Espaguete de Sêmola 500g", 0, 3.50);

        //Criação de fornecimento
        Supply supply1 = new Supply(new GregorianCalendar(2022, Calendar.OCTOBER, 12), 10, dealer2, product1);
        Supply supply2 = new Supply(new GregorianCalendar(2022, Calendar.OCTOBER, 10),5, dealer2, product2);
        Supply supply3 = new Supply(new GregorianCalendar(2022, Calendar.OCTOBER, 3), 20, dealer3, product3);
        Supply supply4 = new Supply(new GregorianCalendar(2022, Calendar.OCTOBER, 3), 20, dealer4, product4);
        Supply supply5 = new Supply(new GregorianCalendar(2022, Calendar.OCTOBER, 3), 20, dealer2, product1);

        //Criando relatório de fornecimentos

        //conferindo quantidade em estoque de cada produto
        //System.out.println(product1);
        //System.out.println(product2);
        //System.out.println(product3);
        //System.out.println(product4);

        System.out.println("---------------Relatório de fornecimentos------------------");
        List<Supply> supplyList = new ArrayList<>();
        supplyList.add(supply1);
        supplyList.add(supply2);
        supplyList.add(supply3);
        supplyList.add(supply4);
        supplyList.add(supply5);

        System.out.println(supplyList);
        System.out.println("=================================================");

        /*=======================Manipulação de vendas=============================*/

        Seller seller1 = new Seller(1, "João da Silva", "Praça 7 de Setembro", "Fragata", "96015-300", "Pelotas", "Rio Grande do Sul", "local1");
        Seller seller2 = new Seller(2, "Juliana Almeida", "General Osório", "Centro", "96020-000", "Pelotas", "Rio Grande do Sul", "local2");

        Item item1 = new Item(1, 15, product1);
        Item item2 = new Item(2, 3, product2);

        Item item3 = new Item(2, 10, product3);
        Item item4 = new Item(2, 20, product4);

        //Tentativa de alteração no estoque utilizada para tratamento de exceção
        Item item5 = new Item(1, 50, product1);
        if(product1.stockChangeError()){
            verify();
        }

        List<Item> itensA = new ArrayList<>();
        itensA.add(item1);
        itensA.add(item2);

        List<Item> itensB = new ArrayList<>();
        itensB.add(item3);
        itensB.add(item4);

        //System.out.println("----------------------Item 1-----------------------------");


        Order order1 = new Order(1, new GregorianCalendar(2022, Calendar.OCTOBER, 15), seller1, itensA);
        Order order2 = new Order(2,new GregorianCalendar(2022, Calendar.OCTOBER, 15), seller2, itensB);



        System.out.println("------------------Relatório de vendas-------------------");

        List<Order> vendas = new ArrayList<>();
        vendas.add(order1);
        vendas.add(order2);

        System.out.println(vendas);

        System.out.println("--------------------Estoque Atualizado-------------------");
        System.out.println(product1.getNome() + " quantidade " + product1.getStock());
        System.out.println(product2.getNome() + " quantidade " + product2.getStock());
        System.out.println(product3.getNome() + " quantidade " + product3.getStock());
        System.out.println(product4.getNome() + " quantidade " + product4.getStock());

    }
    private static void verify() {
        mythrowException();
    }

    private static void mythrowException(){
        try {
            System.out.println("\nOperação não realizada. Estoque do produto é insuficiente.");
            throw new InsufficientStockException();
        } catch (InsufficientStockException e) {
            e.printStackTrace();
        } finally {
            System.err.println("\nClasse de exceção finalizada");
        }
    }

    static class InsufficientStockException  extends Exception {
        public InsufficientStockException () {
            super("\nOperação não realizada. Estoque do produto é insuficiente.");
        }
    }

}
