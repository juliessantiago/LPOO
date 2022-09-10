package model;

public interface AssociadoVip {
    //qualquer atributo criado dentro da interface será uma constante
    //todos os métodos na interface por padrão serão PÚBLICOS e ABSTRATOS

    //tomei liberdade em criar método para quantidade de cotas, sem utilizar método lucros
    Integer getQntdCotas();
    void setQntdCotas(Integer qntdCotas);

    public abstract double lucros(int qntdCotas, double valorCota);


}
