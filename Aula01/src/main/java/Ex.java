import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
// Ex 1: Faça um programa que conte até 10,escrevendo cada número em uma linha

    System.out.println(" 0\n 1\n 2\n 3\n 4\n 5\n 6\n 7\n 8\n 9\n 10");             
        
// Ex 2: Faça um programa que escreva o trecho abaixo, cada frase em uma linha

        System.out.println(" Diz que é verdade, que tem saudade\n "
                            + "Que ainda você pensa muito em mim\n"
                            + " Diz que é verdade, que tem saudade\n"
                            + " Que ainda você quer viver pra mim\n");
    
// Ex 3: Faça um programa que escreva o resultado da operação (10 + 10) / 2 

        int a = (10 + 10)/ 2;
             
        System.out.println(a);
        
// Ex 4: Faça um programa que declare duas variáveis inteiras (val1 e val2,
// com valores 3 e 5 respectivamente) e exiba essas variáveis no console

        int val1 = 3, val2 = 5;
        
        System.out.println(val1 + "\n" + val2);
        
// Ex 5: Faça um programa que declare duas variáveis de texto (quaisquer nomes,
// contendo os valores “ hello ” e “world”) e exiba essas variáveis no console,
// cada uma em uma linha

        String b = "Pedro";
        String c = "Henrique";
        
        System.out.println(b + "\n" + c);
        
/*
Ex 6: Crie um programa Java que
1.
Declare duas variáveis (val1 e val2)
2.
Atribua o valor 2 a val1 e 5 a val2
3.
Armazene o produto (multiplicação) de val1 e
val2 numa outra variável ( result
4.
Exiba a mensagem
        
“O valor de 2 multiplicado por 5 é 10”
*/

        int val3 = 2, val4 = 5, 
                
        resultado = val3 * val4;

        System.out.println("O valor de 2 multiplicado por 5: " + resultado);
    
// Ex 7: Crie um programa Java que declare duas variáveis com valores de sua
// preferência e exiba a soma desses valores no console

        int val6 = 5, val7 = 6,
                
            resultado2 = val6 + val7;
        
        System.out.println("A soma dos dois valores: " + resultado2);
        
// Ex 8: Faça um programa Java que declare duas variáveis de ponto flutuante
// (com casas decimais), com valores 1.5 e 3.5 e exiba a subtração destas no console

        float val8 = 1.5f, val9 = 3.5f;
        
        System.out.println("A subtracao dos valores: " + (val9 - val8));
    } 
}
