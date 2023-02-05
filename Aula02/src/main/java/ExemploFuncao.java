public class ExemploFuncao {
    
    public static void main(String[] args) {
            
        int num = elevadoAoQuadrado(2);
            
        System.out.println("O numero " + 2 + " elevado ao quadrado "
                + "é igual a:" + num); 
    }
        
    //retorno
    //nome
    //parametro
    //corpo
    
    static int elevadoAoQuadrado(int base) {
        int resultado = base * base;
        
        return resultado;
    }
}