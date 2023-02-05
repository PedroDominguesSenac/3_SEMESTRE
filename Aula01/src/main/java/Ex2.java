/*
* 1- Escreva um algoritmo capaz de calcular o salário de um trabalhador com base 
* na quantidade de horas trabalhadas e o valor de cada hora.
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario: ");
        String nome = leitor.nextLine();
        
        System.out.println("Qual o valor da hora trabalhada: ");
        float valorHora = leitor.nextFloat();
        
        System.out.println("Quantas horas foram trabalhadas durante o mes: ");
        float totalHoras = leitor.nextFloat();
        
        float resultado = valorHora * totalHoras;
        
        System.out.println("O salario de: \n" + nome + " é: " + resultado);
        
/*
* 2- Escreva um algoritmo para realizar o seguinte cálculo: “5 multiplicado 
* por 6 mais 2, dividido por 3.      
*/  

        double resultado2 = ((5.0*6.0)+2.0)/3.0;
  // ou float resultado2 = ((5f*6f)+2f/3f;
        
        //System.out.println(resultado2);
        
/*
* 3- Identifique os dados de entrada, processamento e saída no algoritmo abaixo:
●
Código da peça
●
Valor da peça
●
Quantidade da peça no pedido
●
Calcule o valor total do pedido da peça
●
Apresente o código da peça e o valor do pedido
*/
                
        System.out.println("Digite o codigo da peça: ");
        String nome2 = leitor.next();
        
        System.out.println("Digite o valor da peça: ");
        float valorPeca = leitor.nextFloat();
        
        System.out.println("Qual a quantidade de peças que deseja comprar:");
        int quantPeca = leitor.nextInt();
        
        float resultado3 = quantPeca * valorPeca;
        
        System.out.println("Peça: " + nome2 + "\nValor do Pedido: " +resultado3);
        
// 4- Fazer um algoritmo que lê um número e imprime o número

        System.out.println("Digite um numero: ");
        float num = leitor.nextFloat();
        
        System.out.println("O numero digitado é: " + num);
        
// 5- Fazer um algoritmo que lê um número e imprime o quadrado deste número

        System.out.println("Digite um numero: ");
        float num1 = leitor.nextFloat();
        
        System.out.println("Este numero ao quadrado é: " + num1*num1);
        
// 6- Fazer um algoritmo que lê dois números e imprime o produto desses números

        System.out.println("Digite dois numeros: ");
        float num2 = leitor.nextFloat();
        float num3 = leitor.nextFloat();
        
        System.out.println("O produto desses numeros é: " + num2*num3);
        
// 7- Fazer um algoritmo que lê dois números A e B e imprima o resultado de A elevado a B

        System.out.println("Digite dois numeros: ");
        float num4 = leitor.nextFloat();
        float num5 = leitor.nextFloat();
        resultado = (float)Math.pow(num4,num5);
        System.out.println("O primeiro numero elevado pelo segundo é: " + resultado);
    }
    
}
