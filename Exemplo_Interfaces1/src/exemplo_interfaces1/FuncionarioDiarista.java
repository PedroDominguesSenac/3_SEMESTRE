package exemplo_interfaces1;

public class FuncionarioDiarista implements Operacoes{
  
        String nome;
        double valorHora;
        int diasTrabalhados;
        
        public FuncionarioDiarista(String nome, double valorHora, int diasTrabalhados) {
            this.nome = nome;
            this.valorHora = valorHora;
            this.diasTrabalhados = diasTrabalhados;
        }
        
         @Override
    public double calcularSalarioLiquido() {
        
        return (8 * valorHora) + diasTrabalhados;        
    } 
}
