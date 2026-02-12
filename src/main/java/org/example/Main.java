package org.example;


import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developper");
        bootcamp1.setDescricao("Bootcamp java Descricao");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        System.out.println(bootcamp1);



        Dev devPedro = new Dev();
        devPedro.setNome("Pedro Dev1");
        devPedro.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos incritos: " +  devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("Conteudos incritos: " +  devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " +  devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXpTotal());

        System.out.println("------");
        Dev devCaio = new Dev();
        devCaio.setNome("Caio Dev1");
        System.out.println("Conteudos incritos: " +  devCaio.getConteudosInscritos());
        devCaio.inscreverBootcamp(bootcamp1);
        devCaio.progredir();
        System.out.println("Conteudos incritos: " +  devCaio.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " +  devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularXpTotal());



    }
}