package conexao;

import negocio.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarrosDAO {

    // Método para retornar lista de carros, como todos os carros
    public List<Carro> obterListaDeCarros() throws SQLException {
        try {
            //Conecta ao banco de dados por meio da classe de conexão
            Conexao con = new Conexao();
            con.getConexao(); //Obtendo a conexão

            // Comando SQL na base = tabela de carros
            String sql = "select * from tb_carros;";

            //Executa a query (comando SQL)
            /*PreparedStatement é usado para criar um objeto que representa a instrução SQL
            que será executada, sendo que é invocado através do objeto Connection .*/
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();

            //Prepara a lista de carros para retornar
            List<Carro> listaDeCarros;
            listaDeCarros = new ArrayList<>();

            //Para cada item retornado no comando (SQL) faça...
            while (resultado.next()) {
                Carro car = new Carro(); //Criando uma instância, novo carro na memória

                car.setIdCarro(resultado.getInt("idCarro")); // Define ID do carro;
                car.setFabricante(resultado.getString("fabricante")); // Define ID do carro;
                car.setModelo(resultado.getString("modelo")); // Define ID do carro;
                car.setCor(resultado.getString("cor")); // Define ID do carro;
                car.setKm(resultado.getDouble("km")); // Define ID do carro;
                car.setValor(resultado.getDouble("valor")); // Define ID do carro;
                car.setAno(resultado.getInt("anoFabricacao")); // Define ID do carro;

                // Insere o carro na lista Local
                listaDeCarros.add(car);
            }

            // Após terminar, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();

            // Retorna a lista de carros
            return listaDeCarros;
        } catch (SQLException e) { //Caso dê alguma exceção
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void insereCarro(Carro car) {
        
        Conexao conexao = new Conexao();
        PreparedStatement st = null;

        try {
            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_carros"
                    + "(fabricante, modelo, anoFabricacao, cor, km, valor)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, car.getFabricante());
            st.setString(2, car.getModelo());
            st.setInt(3, car.getAno());
            st.setString(4, car.getCor());
            st.setDouble(5, car.getKm());
            st.setDouble(6, car.getValor());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    car.setIdCarro(id);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }
    }

}
