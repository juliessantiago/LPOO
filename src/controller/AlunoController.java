package controller;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
            System.out.println("Construtor padrao 1:");
            System.out.println(aluno1.toString());
            System.out.println("===================================");

        Aluno aluno2 = new Aluno();
            System.out.println("Construtor padrao 2:");
            System.out.println(aluno2.toString());
            System.out.println("===================================");


    Aluno aluno3 = new Aluno(3, 785, 27, "Maria", "Silva", "mariasilva@gmail.com");
        System.out.println("Construtor parametrizado com todos atributos:");
        System.out.println(aluno3.toString());
        System.out.println("===================================");

    Aluno aluno4  = new Aluno(4, 425, 35, "Jose", "Lopes", "joselopes@gmail.com");
        System.out.println("Construtor parametrizado com todos atributos:");
        System.out.println(aluno4.toString());
        System.out.println("===================================");

    Aluno aluno5 = new Aluno("Henrique", "Duarte");
        System.out.println("Construtor parametrizado com 2 atributos:");
        System.out.println(aluno5.toString());
        System.out.println("===================================");

    Aluno aluno6 = new Aluno("Luísa", "Fernandes");
        System.out.println("Construtor parametrizado com 2 atributos:");
        System.out.println(aluno6.toString());
        System.out.println("===================================");

    Aluno aluno7 = new Aluno();
        System.out.println("Construtor padrao com metodos getters e setters: ");
        aluno7.setId(7);
        System.out.println(aluno7.getId());
        aluno7.setCpf(900);
        System.out.println(aluno7.getCpf());
        aluno7.setIdade(75);
        System.out.println(aluno7.getIdade());
        aluno7.setNome("Meryl");
        System.out.println(aluno7.getNome());
        aluno7.setSobrenome("Streep");
        System.out.println(aluno7.getSobrenome());
        aluno7.setEmail("streep.oscar@gmail.com");
        System.out.println(aluno7.getEmail());
        System.out.println("===================================");


    Aluno aluno8 = new Aluno();
        System.out.println("Construtor padrao com metodos getters e setters: ");
        aluno8.setId(8);
        System.out.println(aluno8.getId());
        aluno8.setCpf(901);
        System.out.println(aluno8.getCpf());
        aluno8.setIdade(77);
        System.out.println(aluno8.getIdade());
        aluno8.setNome("Robert");
        System.out.println(aluno8.getNome());
        aluno8.setSobrenome("DeNiro");
        System.out.println(aluno8.getSobrenome());
        aluno8.setEmail("deniro.oscar@gmail.com");
        System.out.println(aluno8.getEmail());
        System.out.println("===================================");


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);
        System.out.println(alunos);
    }
}


