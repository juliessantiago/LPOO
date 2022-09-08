package model;

public interface AssociadoVip {
    //qualquer atributo criado dentro da interface será uma constante
    //então, nesse caso somente se criará os métodos aqui

    //todos os métodos na interface por padrão serão PÚBLICOS e ABSTRATOS

    public abstract double lucros(int qntdCotas, double valorCota);

}
