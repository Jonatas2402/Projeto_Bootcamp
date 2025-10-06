import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SpringBoot");
        curso2.setDescricao("Descrição do curso Springboot");
        curso2.setCargaHoraria(20);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developr");
        bootcamp.setDescricao("Bootcamp de java para desenvolvimento back end");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Jonatas");
        dev1.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() +": " + dev1.getConteudosConcluidos());
        System.out.println("Xp total: " + dev1.calcularTotalXp());
        System.out.println("-----------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() +": " + dev2.getConteudosConcluidos());
        System.out.println("Xp total: " + dev2.calcularTotalXp());
    }
}