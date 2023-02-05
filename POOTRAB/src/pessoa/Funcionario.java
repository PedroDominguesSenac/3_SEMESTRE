package pessoa;

public class Funcionario extends Pessoa {

    private double salario, bonus;
    private int ID, horas;
    

    public Funcionario(double salario, double bonus, int ID, int horas) {
        this.salario = salario;
        this.bonus = bonus;
        this.horas = horas;
        this.ID = ID;
    }

    public Funcionario() {
        
    }
    
    @Override
    public String exibirDados() {
        String dados;
        dados = super.exibirDados();

        dados += "Salario: " + salario + "\n";
        dados += "Bonus: " + bonus + "\n";
        dados += "Horas trabalhadas: " + horas + "\n";
        dados += "ID: " + ID;

        return dados;
    }
    
    public void calcularHoras(int horas){
        int _1h = 50;
        int conta = horas * _1h;
        this.salario = this.salario + conta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}