package one.digitalinnovation.modulo3.desafioProjeto;

import one.digitalinnovation.modulo3.desafioProjeto.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição - Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição - Curso JS");
        curso2.setCargaHoraria(4);

        //polimorfismo
        Conteudo conteudo = new Curso();

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(conteudo);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição - Mentoria Java");
        mentoria1.setData(LocalDate.now()); //data de criação (ano/mes/dia)

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição - Mentoria JS");
        mentoria2.setData(LocalDate.now()); //data de criação (ano/mes/dia)

        //System.out.println(mentoria1);
        //System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devDaniele = new Dev();
        devDaniele.setNome("Daniele");
        //Conteudos que cada Dev está inscrito
        devDaniele.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Daniele = " + devDaniele.getConteudosInscritos());

        devDaniele.progredir();
        devDaniele.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos - Daniele = " + devDaniele.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Daniele = " + devDaniele.getConteudosConcluidos());
        System.out.println("XP - Daniele = " + devDaniele.calcularTotalXp());

        System.out.println("------------------------------------------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        //Conteudos que cada Dev está inscrito
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos - Bruno = " + devBruno.getConteudosInscritos());

        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir(); //finalizou todos os bootcamps e mentorias
        System.out.println("---");
        System.out.println("Conteudos Inscritos - Bruno = " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos Concluidos - Bruno = " + devBruno.getConteudosConcluidos());
        System.out.println("XP - Bruno = " + devBruno.calcularTotalXp());
    }
}
