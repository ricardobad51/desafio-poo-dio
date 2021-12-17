package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {




    public Curso() {
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() + '\'' +
                ", data =" + getData()+'\''+
                '}';
    }


}