package sobre_carga;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = scan.nextLine();
        
        System.out.println("Informe o RG: ");
        String rg = scan.nextLine();
        
        System.out.println("Informe o CPF: ");
        String cpf = scan.nextLine();
        
        System.out.println("Informe o RA: ");
        int registroAluno = scan.nextInt();
        
        System.out.println("Informe a nota do vestibular: ");
        float notaVestibular = scan.nextFloat();
        
        System.out.println("Informe o curso: ");
        String curso = scan.nextLine();
        
        System.out.println("Informe a : ");
        String dataMatricula = scan.nextLine();
               
        
        Aluno a1 = new Aluno(nome, rg, cpf, registroAluno, notaVestibular, curso, dataMatricula);
        
        System.out.println("\t - Dados do Aluno RA n: " + a1.registroAluno);
        System.out.println(a1.retornaDados());
        
    }
}
