package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaCorrente cc3 = new ContaCorrente();

        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaPoupanca cp3 = new ContaPoupanca();

        //Inserindo valores válidos em cada uma das contas:
        cc1.deposita(1000);
        cc2.deposita(3000);
        cc3.deposita(4500);

        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        






    }


}
