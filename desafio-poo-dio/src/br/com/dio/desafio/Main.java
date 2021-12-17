package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrevendo algo para o curso");
        curso1.setCargaHoraria(25);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrevendo algo para o curso dois");
        curso2.setCargaHoraria(15);

        Conteudo conteudo = new Curso();

        Conteudo conteudo1 = new Mentoria();

       // List<String>

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição para mentoria de Java");
        mentoria1.setCargaHoraria(45);
        mentoria1.setData(LocalDate.now());

 /*       System.out.println(curso1 + "\n");
        System.out.println(curso2 + "\n");
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrevendo esse negocio ai oh");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devRicardo = new Dev();
        devRicardo.setName("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos de: " + devRicardo.getName() + " Inscritos: " + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        devRicardo.progredir();
        devRicardo.progredir();
        System.out.println("Conteudos de: " + devRicardo.getName() + " Inscritos: " + devRicardo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devRicardo.getConteudosConcluidos());
        System.out.println("XP: " + devRicardo.calcularTotalXp());


        Dev devFoberval = new Dev();
        devFoberval.setName("Foberval");
        devFoberval.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos : " + devFoberval.getName() + " Inscritos: " + devFoberval.getConteudosInscritos());
        devFoberval.progredir();
        devFoberval.progredir();
        System.out.println("Conteudos : " + devFoberval.getName() + " Inscritos: " + devFoberval.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devFoberval.getConteudosConcluidos());
        System.out.println("XP: " + devFoberval.calcularTotalXp());


    }
}
