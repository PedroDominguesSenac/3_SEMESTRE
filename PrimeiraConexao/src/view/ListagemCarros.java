package view;
//Importar classes necessárias

import conexao.CarrosDAO;
import java.sql.SQLException;
import negocio.Carro;
import java.util.ArrayList;
import java.util.List;

public class ListagemCarros {
    // Método para listar todos os carros

    public void listaTodosCarros() throws SQLException {

        // Cria uma instância de CarrosDAO na memória
        CarrosDAO carro = new CarrosDAO();

        // Gera a lista de carros localmente, que será preenchida
        List<Carro> listaDeCarros;
        listaDeCarros = new ArrayList<>();

        // Pega (obtém) a lista de carros através do objeto
        listaDeCarros = carro.obterListaDeCarros();

        // Inicia a impressão dos dados dos carros do banco
        System.out.println("\nID\t|\tMarca\t|\tModelo\t|\tAno\t|\tCor\t|\tKm\t|\tPreço");
        System.out.println("----\t|\t-----\t|\t------\t|\t---\t|\t---\t|\t------\t|\t----");

        for (Carro carroLocal : listaDeCarros) { // Iterator: Para cada carro na lista de carros...
            System.out.print(carroLocal.getIdCarro() + "\t|\t");
            System.out.print(carroLocal.getFabricante() + "\t|\t");
            System.out.print(carroLocal.getModelo() + "\t|\t");
            System.out.print(carroLocal.getAno() + "\t|\t");
            System.out.print(carroLocal.getCor() + "\t|\t");
            System.out.print(carroLocal.getKm() + "\t|\t");
            System.out.print(carroLocal.getValor());
            System.out.println("\n");
        }
    }
}
