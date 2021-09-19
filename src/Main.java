import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){

        Curso curso1 =new Curso();
        Mentoria mentoria1=new Mentoria();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(300);
       // System.out.println(curso1);

        mentoria1.setTitulo("Curso Js");
        mentoria1.setDescricao("Descrição do curso Js");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVitor=new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Vitor:"+devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Vitor:"+devVitor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vitor:"+devVitor.getConteudosConcluidos());
        System.out.println("Xp: "+devVitor.calcularxp());


        System.out.println();
        Dev devHugo=new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Hugo:"+devHugo.getConteudosInscritos());
        devHugo.progredir();
        System.out.println("-----------------");
        System.out.println("Conteúdos Inscritos Hugo:"+devHugo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Hugo:"+devHugo.getConteudosConcluidos());

        System.out.println("Xp: "+devHugo.calcularxp());









    }

}
