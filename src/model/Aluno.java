package model;

public class Aluno{
    private int id = 1;
    private int cpf = 123;
    private int idade = 20;
    private String nome = "Nome padrão";
    private String sobrenome = "Sobrenome padrao";
    private String email = "emailpadrao@gmail.com";

    //construtor parametrizado com todos atributos:
    public Aluno(int id, int cpf, int idade, String nome, String sobrenome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    //construtor parametrizado com 2 atributos
    public Aluno(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //construtor padrão:
    public Aluno() {

    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*--------------Id--------------------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*--------------CPF--------------------*/
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /*--------------Idade--------------------*/
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*--------------Nome-------------------*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*--------------Sobrenome-------------------*/
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /*--------------Email-------------------*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

