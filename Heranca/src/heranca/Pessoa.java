package heranca;

public class Pessoa {
    
    String nome, rg, cpf;
    
    public String retornaDados() {
        String dados = "";
        
        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        
        return dados;
    }    
}
