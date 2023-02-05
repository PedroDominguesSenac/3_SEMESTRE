package aula3_exercicio_1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        float num;

        Scanner scan = new Scanner(System.in);

        Dobro dob = new Dobro();
        
        System.out.println("Informe um numero: ");
        num = scan.nextFloat();

        dob.setD(num);

        System.out.println("O dobro de " + dob.getD() + " é: " + dob.Dobro());
    }
}