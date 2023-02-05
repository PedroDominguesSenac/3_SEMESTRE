package aula6;

public class Vetores_Relacionados {
    
    public static void main(String[] args) {
        
        String mes[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", 
            "Stembro", "Outubro", "Novembro", "Dezembro"};
        
        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i;
        
        for(i=0; i<mes.length; i++) {
            System.out.printf("%s tem %d dias\n", mes[i], diasMes[i]);
        }
        System.out.println("\n");        
    }
}
