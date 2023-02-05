package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    //Status da conexão, para consultas
    private String statusConexao = "Não conectado!";
    
    public Connection getConexao(){
        //Atributo para conexao
        Connection conexao = null;
        
        //Inicia-se a tentativa de conexão
        try{
            //Define o driver de conexão padrão para essa conexão
            String nomeDriver = "com.mysql.cj.jdbc.Driver"; //com.mysql.jdbc.Driver 
            Class.forName(nomeDriver);
            
            //Define os parâmetros de conexão ao banco
            //String servidor = "localhost"; //Caminho de rede até o BD
            String servidor = "localhost"; //Caminho de rede até o BD
            String schema = "db_carros";  //Nome do banco
            
            //URL para o driver JDBC
            String url = "jdbc:mysql://" + servidor + "/" + schema;
            
            //Parâmetros de conexão (usuário e senha)
            String usuario = "root";
            String senha = "12345678";
            
            //Define a conexão
            conexao = (Connection)DriverManager.getConnection(url,usuario,senha);
           
            
            //Testando a conexão
            if(conexao != null){ //Se a conexão estiver OK, ela não é nula
                //Troca o status da conexão
                statusConexao = "Conectado!";
            } else{
                statusConexao = "Não conectado!";
            }
            
            //Retorna a conexão para quem for utilizá-la
            return conexao;
            
        } catch(ClassNotFoundException e){ //Caso o driver de conexão não seja encontrado
            System.out.println("Driver de conexão não encontrado!");
            return null;
        } catch(SQLException e){//Caso não consiga conectar
            System.out.println("Falha na conexão!");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    //Retorna o status da conexão
    public String getStatusConexao(){
        return statusConexao;
    }
    
    //Método para encerrar (fechar) a conexão
    public boolean fechaConexao(){
        try{
            getConexao().close(); //Fecha a conexão
            statusConexao = "Conexão Fechada"; //Atualiza o Status da Conexão
            return true; //Retorna verdadeiro; conseguiu fechar
        } catch(SQLException e){
            //Caso dê algum erro, imprima
            System.out.println(e.getMessage());
            return false;
        }       
    }
    
    //Método para reiniciar a conexão, se necessário
    public Connection reiniciaConexao(){
        fechaConexao(); //Fecha a mesma
        return getConexao(); //Abre e retorna
    }
}
