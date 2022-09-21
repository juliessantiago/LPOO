package model;

public class Manager extends Employee { //Gerente que estende Funcionário

    public Manager(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }

    private String formacao;



    public void autorizarCompra(){

    }

}
