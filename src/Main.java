import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAugusto = new Dev();
        devAugusto.setNome("Augusto");
        devAugusto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devAugusto.getConteudosInscritos());
        devAugusto.progredir();
        devAugusto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devAugusto.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devAugusto.getConteudosConcluidos());
        System.out.println("XP:" + devAugusto.calcularTotalXp());

        System.out.println("-------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());

    }

}