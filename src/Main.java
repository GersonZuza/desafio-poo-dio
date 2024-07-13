import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGerson = new Dev();
        devGerson.setNome("Gerson");
        devGerson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gerson: " + devGerson.getConteudosInscritos());
        devGerson.progredir();
        devGerson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gerson: " + devGerson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gerson: " + devGerson.getConteudosConcluidos());
        System.out.println("XP" + devGerson.calcularTotalXp());

        System.out.println("--------------");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos incritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP" + devMarcos.calcularTotalXp());

    }
}