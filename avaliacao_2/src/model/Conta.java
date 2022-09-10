package model;

public abstract class Conta {
    //abstract: não serão criadas instâncias de objetos diretamente de Conta
    protected double saldo;
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
       this.saldo = this.saldo + valor;

   }

   public void saca(double valor){
       //regras de negócio devem ficar na Model
       double saldoAtual = this.saldo - valor;
       if( saldoAtual >0){
           this.saldo = this.saldo - valor;
       }else{
           System.out.println("Saldo insuficiente. Não foi possível realizar o saque");
       }

   }

   public void atualiza(double taxa){
       if (taxa > 0){
           this.saldo = this.saldo * (taxa / 100) + this.saldo;
       }else{
           System.out.println("Taxa negativa informada. Não é possível realizar a operação");
       }

   }


}
