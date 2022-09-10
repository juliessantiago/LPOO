package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;

public class ContaController {
    public static void main(String[] args) {
        //criar 3 instâncias de cada classe
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaPoupanca cp3 = new ContaPoupanca();

        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaCorrente cc3 = new ContaCorrente();

        Associado assoc1 = new Associado();
        Associado assoc2 = new Associado();
        Associado assoc3 = new Associado();

        //Inserir valores válidos em cada uma das contas:
        cp1.setSaldo(1500);
        cp2.setSaldo(2000);
        cp3.setSaldo(3700);

        cc1.setSaldo(4000);
        cc2.setSaldo(5600);
        cc3.setSaldo(3000);

        assoc1.setNome("Maria da Silva");
        assoc2.setNome("João Gonçalves");
        assoc3.setNome("José Barbosa");

        //Imprimir cada um dos objetos:

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

        //Criar coleções
        ArrayList<ContaCorrente> contaCorrenteList = new ArrayList<>();
        contaCorrenteList.add(cc1);
        contaCorrenteList.add(cc2);
        contaCorrenteList.add(cc3);

        ArrayList<ContaPoupanca> contaPoupancaList = new ArrayList<>();
        contaPoupancaList.add(cp1);
        contaPoupancaList.add(cp2);
        contaPoupancaList.add(cp3);

        //AssociadoVip compreende instâncias de Associado e de ContaCorrente

        ArrayList<AssociadoVip> associadoVipList = new ArrayList<>();
        associadoVipList.add(assoc1);
        associadoVipList.add(assoc2);
        associadoVipList.add(assoc3);
        associadoVipList.add(cc1);
        associadoVipList.add(cc2);
        associadoVipList.add(cc3);



        System.out.println("==================Colecoes==================");

        System.out.println("Conta Poupança");
        System.out.println(contaPoupancaList);

        System.out.println("Conta Corrente");
        System.out.println(contaCorrenteList);

        System.out.println("=============================================");

        System.out.println("Associados Vip");
        System.out.println(associadoVipList);
        System.out.println("=============================================");

        //Movimentação de uma conta poupança
        //Depósito de R$ 1000, atualização de 5%, saque de R$ 50,00
        System.out.println("============Movimentacao conta poupanca=======");
        cp1.deposita(1000);
        cp1.atualiza(5);
        cp1.saca(5);
        System.out.println(cp1.getSaldo());

        //Movimentação de uma conta corrente
        //Depósito de R$500,00, saque de R$400,00
        System.out.println("===========Movimentacao conta corrente=========");
        cc1.deposita(500);
        cc1.saca(400);
        System.out.println(cc1.getSaldo());
        System.out.println("=============================================");

        //Inserir quantidade de cotas em Associados Vip
        cc1.setQntdCotas(100);
        cc2.setQntdCotas(400);
        cc3.setQntdCotas(600);
        assoc1.setQntdCotas(300);
        assoc2.setQntdCotas(600);
        assoc3.setQntdCotas(600);

        System.out.println("Associados Vip com suas quantidades de cotas");
        System.out.println(associadoVipList);
        System.out.println("=============================================");

        //Imprimir os associados, em ordem descrescente de cotas

        ArrayList<Associado> associadoList = new ArrayList<>();
        associadoList.add(assoc1);
        associadoList.add(assoc2);
        associadoList.add(assoc3);

        associadoList.sort(Comparator.comparing(Associado::getQntdCotas).reversed());
        System.out.println("Lista de associados em ordem descrescente de cotas");
        System.out.println(associadoList);
        System.out.println("===================================");

        //Associado com maior número de cotas

        Associado assocMaior = associadoList.get(0);
        System.out.println(assocMaior);

        //Qual seria a forma de exibir a lista de associados com maior número de cotas?

        //Imprimir TODAS as contas cadastradas no sistema, em ordem
        //descrescente de saldo
        ArrayList<Conta> todasContasList = new ArrayList<>();
        todasContasList.add(cc1);
        todasContasList.add(cc2);
        todasContasList.add(cc3);
        todasContasList.add(cp1);
        todasContasList.add(cp2);
        todasContasList.add(cp3);

        todasContasList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("Lista de contas em ordem descrescente de saldo");
        System.out.println(todasContasList);
        System.out.println("==============================================");


    }

}
