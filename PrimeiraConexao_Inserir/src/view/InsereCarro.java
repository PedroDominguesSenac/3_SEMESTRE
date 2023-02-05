package view;

import conexao.CarrosDAO;
import negocio.Carro;
import java.util.Scanner;

public class InsereCarro {

    public void InsereCarro() {

        try {

            Scanner sc = new Scanner(System.in);
            Carro carro = new Carro();

            System.out.println("\n---  INSIRA OS DADOS DO CARRO  ---");

            System.out.print("\nInforme o Fabricante: ");
            String fabricante = sc.nextLine().toUpperCase();

            System.out.print("Informe o Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Informe o Ano: ");
            int ano = sc.nextInt();

            System.out.print("Informe a Cor: ");
            String cor = sc.next();
            
            System.out.print("Informe a Kilometragem: ");
            double km = sc.nextDouble();

            System.out.print("Informe o Valor: ");
            double valor = sc.nextDouble();
            System.out.println("\n");

            carro.setFabricante(fabricante);
            carro.setModelo(modelo);
            carro.setAno(ano);
            carro.setCor(cor);
            carro.setKm(km);
            carro.setValor(valor);

            CarrosDAO cD = new CarrosDAO();
            cD.insereCarro(carro);
            System.out.println("\nCarro inserido com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
