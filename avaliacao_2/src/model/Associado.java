package model;

public class Associado implements AssociadoVip {
    private Integer qntdCotas;
    private String nome;

    @Override
    public Integer getQntdCotas(){
        return  qntdCotas;
    }
    @Override
    public void setQntdCotas(Integer qntdCotas){
        this.qntdCotas = qntdCotas;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override

    public double lucros(int qntdCotas, double valorCota){
        return (valorCota * qntdCotas);
    }

    @Override
    public String toString() {
        return "\nAssociado{" +
                "qntdCotas=" + qntdCotas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
