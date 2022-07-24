package controller;
import model.Aluno;

import java.util.*;

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


    Aluno aluno3 = new Aluno(15, 785, 27, "Maria", "Silva", "mariasilva@gmail.com");
        System.out.println("Construtor parametrizado com todos atributos:");
        System.out.println(aluno3.toString());
        System.out.println("===================================");

    Aluno aluno4  = new Aluno(14, 425, 35, "Jose", "Lopes", "joselopes@gmail.com");
        System.out.println("Construtor parametrizado com todos atributos:");
        System.out.println(aluno4.toString());
        System.out.println("===================================");

    Aluno aluno5 = new Aluno("Henrique", "Duarte");
        System.out.println("Construtor parametrizado com 2 atributos:");
        System.out.println(aluno5.toString());
        System.out.println("===================================");

    Aluno aluno6 = new Aluno("Luisa", "Fernandes");
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


        /*========Alterando IDs para poder ordenar as colecoes corretamente*/
        aluno1.setId(1);
        aluno2.setId(4);
        aluno3.setId(5);
        aluno4.setId(2);
        aluno5.setId(8);
        aluno6.setId(3);
        aluno7.setId(6);
        aluno8.setId(7);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);

        System.out.println("========Colecoes - List==========");
        System.out.println("Lista nao ordenada");
        System.out.println(alunos);
        System.out.println("===================================");

        alunos.sort(Comparator.comparing(Aluno::getId));
        System.out.println("Lista ordenada");
        System.out.println(alunos);
        System.out.println("===================================");

        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("Lista em ordem descrescente");
        System.out.println(alunos);
        System.out.println("===================================");

        Aluno resultado = alunos.stream().filter(a -> a.getId().equals(5)).findAny().orElse(null);
        System.out.println("Valor pesquisado");
        System.out.println(resultado);
        System.out.println("===================================");



        System.out.println("========Colecoes - Map==========");

        Map<Integer, Aluno> alunosMap  = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);
        alunosMap.put(aluno7.getId(), aluno7);
        alunosMap.put(aluno8.getId(), aluno8);
        System.out.println(alunosMap);

        System.out.println("===============================");
        System.out.println("Nao e possivel fazer ordenacao em Map");



    }
}


