package exeordena3;

import java.util.Scanner;

public class ExeOrdena3 {

    public static void main(String[] args) { 
        Livro livro1 = new Livro(12, 200.14, "Deitel", "Java: Como programar");
        Livro livro2 = new Livro(18, 145.36, "Paulo Feofiloff", "Algoritmos em linguagem C");
        Livro livro3 = new Livro(23, 87.9, "Edgar Alan Poe", "Contos extraordinários");
        Livro livro4 = new Livro(25, 102.54, "Carl Sagan", "Pálido ponto azul");
        Livro livro5 = new Livro(21, 123.67, "Isaac Asimov", "Fundação");

        Metodos.inserir(livro1);
        Metodos.inserir(livro2);
        Metodos.inserir(livro3);
        Metodos.inserir(livro4);
        Metodos.inserir(livro5);

        Metodos.exibir();
        if(Metodos.remover(2765)){
            System.out.println("Removido com sucesso!");
        }else{
            System.out.println("Não foi possível remover!");
        }
        /*Livro livro = Metodos.buscar("Algoritmos em linguagem C");
        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado!");
        }*/
       
        Metodos.exibir();
    }
}
