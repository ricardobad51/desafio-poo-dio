package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1 + "\n");
        System.out.println(curso2 + "\n");
        System.out.println(mentoria1);

    }
}
