package org.example;

import org.example.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Curso Mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        conteudo.setDescricao("Descrição conteúdo");
        conteudo.setTitulo("Título conteúdo");

//        System.out.println(conteudo);
//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        devRafael.progredir();
        devRafael.progredir();
        System.out.println(devRafael.getConteudoInscritos());
        System.out.println(devRafael.calcularTotalXp());
        System.out.println(devRafael.getConteudosConcluidos());


        Dev devDanielle = new Dev();
        devDanielle.setNome("Danielle");
        devDanielle.inscreverBootcamp(bootcamp);
        System.out.println(devDanielle.calcularTotalXp());
        System.out.println(devDanielle.getConteudoInscritos());
        System.out.println(devDanielle.getConteudosConcluidos());

    }
}