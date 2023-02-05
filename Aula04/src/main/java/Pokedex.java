import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokedex {
    public static void main(String[] args) {
        List<String> pokemons = new ArrayList<String>();
        List<Integer> hps = new ArrayList<Integer>();
        Scanner leitor = new Scanner(System.in);
        
        
        Character c = 's';
        c.toString().equalsIgnoreCase("S")
        while (c == 's' || c == 'S')
        
        
        int resposta = 2;
        do {
            System.out.println("Digite o nome do pokemon");
            pokemons.add(leitor.next());
            System.out.println("Digite o HP do pokemon");
            hps.add(leitor.nextInt());
            
            System.out.println("Adicionar mais um (1 = s/2 = n)?");
            resposta = leitor.nextInt();
        } while(resposta == 1);
        
        System.out.println("Digite o nome do pokemon a procurar");
        String consulta = leitor.next();
        
        int count = 0;
        boolean encontrado = false;
        
        while (count < pokemons.size() || !encontrado) {
            if (pokemons.get(count).equalsIgnoreCase(consulta)) {
                System.out.println(pokemons.get(count));
                System.out.println(hps.get(count));
                encontrado = true;
            }
            count++;
        }
    }
}