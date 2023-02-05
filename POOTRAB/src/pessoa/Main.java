package pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;
import salario.calcBonus;
import salario.calcDesconto;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int aux1 = -1, aux2 = -1, aux6 = -1, horas = 0, id;
        String nome = "", rg, cpf;
        double salario = 0, bonus = 0;
        char aux3, aux4, aux5;
        float INSS, IRPF, VT, VA, VR, CVN;
        calcDesconto calc = new calcDesconto();
        Funcionario func = new Funcionario();
        calcBonus calc1 = new calcBonus();

        while (aux2 != 2) {
            System.out.println("[0] - Inserir dados do funcionario\n"
                    + "[1] - Exibir dados e holerite\n"
                    + "[2] - Sair");
            aux2 = leitor.nextInt();
            switch (aux2) {
                case 0:
                    while(aux1 != 2) {
                        leitor.nextLine();
                        System.out.println("Digite o nome do funcionario:");
                        nome = leitor.nextLine();
                        func.setNome(nome);
                        System.out.println("Digite o RG do funcionario:");
                        rg = leitor.next();
                        func.setRg(rg);
                        System.out.println("Digite o CPF do funcionario:");
                        cpf = leitor.next();
                        func.setCpf(cpf);
                        System.out.println("Digite o ID do funcionario:");
                        id = leitor.nextInt();
                        func.setID(id);
                        System.out.println("Digite o salario do funcionario:");
                        salario = leitor.nextDouble();
                        System.out.println("Digite as horas extras trabalhadas do funcionario:");
                        horas = leitor.nextInt();
                        
                        System.out.println("O funcionario possui algum bonus?\nY - Sim\nN - Nao");
                        aux3 = leitor.next().charAt(0);
                        if (aux3 == 'Y' || aux3 == 'y') {
                            System.out.println("Digite o valor do bonus do funcionario:");
                            bonus = leitor.nextDouble();
                        }
                        System.out.println("Quer inserir mais algum funcionario ou ver o holerite do ultimo funcionario inserido?\nY - Sim\nN - Nao");
                        aux4 = leitor.next().charAt(0);
                        leitor.nextLine();
                        if (aux4 == 'N' || aux4 == 'n') {
                            System.out.println("Obrigado por usar o nosso sistema!");
                            System.exit(0);
                            
                        }
                        if(aux4 == 'Y' || aux4 == 'y'){
                            break;
                        }
                    }
                    break;
                case 1:
                    while(aux6 != 2){
                        func.setSalario(salario);
                        func.calcularHoras(horas);
                        calc.setSalario(func.getSalario());
                        System.out.print("---------------------------------------------------------\n"
                                         + "|\t\t\t - HOLERITE - \t\t\t|\n"
                                         + "---------------------------------------------------------\n"
                                         + "|\t\t\t\t\t\t\t|\n"
                                         + "|Nome: " + func.getNome() + "\n"
                                         + "|ID: " + func.getID() + "\n"
                                         + "|CPF: " + func.getCpf() + "\n"
                                         + "|RG: " + func.getRg() +"\n"
                                         + "|\t\t\t\t\t\t\t|\n"
                                         + "|CREDITOS: - \t\t\t\t\t\t|\n"
                                         + "|Salario bruto:\t R$ " + func.getSalario() + "\t\t\t\t|\n"
                                         + "|Bonus:\t R$ " + bonus + "\t\t\t\t\t|\n"
                                         + "|\t\t\t\t\t\t\t|\n"
                                         + "|DEBITOS: - \t\t\t\t\t\t|\n"
                                         + "|Desconto INSS: " + calc.INSS());
                        System.out.print("\t\t\t\t\t|\n");
                        System.out.print("|Desconto IRPF: " + calc.IRPF());
                        System.out.print("\t\t\t\t\t|\n");
                        System.out.print("|Desconto VT: " + calc.VT());
                        System.out.print("\t\t\t\t\t|\n");
                        System.out.print("|Desconto VA: " + calc.VA());
                        System.out.print("\t\t\t\t\t|\n");
                        System.out.print("|Desconto VR: " + calc.VR());
                        System.out.print("\t\t\t\t\t|\n");
                        System.out.print("|Desconto Convenio: " + calc.CVN());
                        System.out.print("\t\t\t\t|\n");
                        calc1 = new calcBonus(calc.retornaSalario(), bonus);
                        System.out.print("|\t\t\t\t\t\t\t|");
                        System.out.print("\n|TOTAL: - ");
                        System.out.print("\t\t\t\t\t\t|");
                        System.out.printf("\n|Salario liquido sem bonus: R$%.2f ", calc.getSalario());
                        System.out.print("\t\t\t|\n");
                        System.out.printf("|Salario liquido com bonus: R$%.2f ", calc1.getSalBonus());
                        System.out.print("\t\t\t|\n\n");
                        System.out.print("Quer sair do programa?\nY - Sim\nN - Nao\n");
                        aux5 = leitor.next().charAt(0);
                        if (aux5 == 'N' || aux5 == 'n') {
                            break;
                        }
                        if(aux5 == 'Y' || aux5 == 'y'){
                            System.out.println("Obrigado por usar o nosso sistema!");
                            System.exit(0);
                        }
                    }
                    break;
            }
        }
        System.out.println("Obrigado por usar o nosso sistema!");
    }

}
