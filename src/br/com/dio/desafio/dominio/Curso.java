package br.com.dio.desafio.dominio;

import java.awt.*;

public class Curso extends Conteudo {


    private int cargaHoraria;

    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso" +
                "\ntitulo: " + getTitulo() +
                "\ndescrição:" + getDescricao()  +
                "\ncarga horaria:" + cargaHoraria ;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }
}
