package aula2_salario;

public class CalculoSalario {
    
    int salarioBruto;
    int desconto;
    
    public CalculoSalario(int x, int y) {
        x = salarioBruto;
        y = desconto;       
    } 
    
    public int SalarioLiquido() {
        return salarioBruto - desconto;
    }
}
