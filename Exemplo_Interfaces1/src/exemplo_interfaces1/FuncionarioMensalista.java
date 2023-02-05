package exemplo_interfaces1;

public class FuncionarioMensalista implements Operacoes {
    
    String nome;
    double salario;

    public FuncionarioMensalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        
    }

    @Override
    public double calcularSalarioLiquido() {
     
        return this.salario = this.salario + 27.5 / 100;
    }
    
    
}
