package model;

public class ContaCorrente extends Conta implements AssociadoVip{
    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
    @Override
    //no caso da conta corrente, é possível deixar um saldo negativo
    //esse comportamento vai sobrescrever o de Conta
    public void saca(double valor){
        //regras de negócio devem ficar na Model
        double saldoAtual = this.saldo - valor;
        if( saldoAtual >=-200){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente. Não foi possível realizar o saque");
        }

    }

    @Override
    //implementando o comportamento
    public double lucros(int qntdCotas, double valorCota){
        return (valorCota * qntdCotas) + this.saldo;
    }




}
