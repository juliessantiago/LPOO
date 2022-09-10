package model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private int qntdCotas;
    @Override
    public Integer getQntdCotas(){
        return  qntdCotas;
    }
    @Override
    public void setQntdCotas(Integer qntdCotas){
        this.qntdCotas = qntdCotas;
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
    //implementando por obrigação o comportamento lucros
    public double lucros(int qntdCotas, double valorCota){
        return (valorCota * qntdCotas);
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qntdCotas=" + qntdCotas + " Saldo: " + saldo +
                '}';
    }
}
