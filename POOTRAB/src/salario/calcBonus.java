package salario;


public class calcBonus {
    
    private double salBonus;
    
    public calcBonus(double salario, double bonus){
        this.salBonus = salario + bonus;
    }

    public calcBonus() {
    }

    public double getSalBonus() {
        return salBonus;
    }

    public void setSalBonus(double salBonus) {
        this.salBonus = salBonus;
    }

}