import java.util.Random;
import java.util.Scanner;

public class Exe04pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da cadeia de DNA: ");
        int tamanhoCadeia = scanner.nextInt();
        scanner.nextLine();

        String cadeia1 = CadeiaDeDna.gerarCadeiaDeDna(tamanhoCadeia);
        String cadeia2 = CadeiaDeDna.gerarCadeiaDeDna(tamanhoCadeia);

        System.out.println("Fator de Corte da Combinacao: " + AlgoritmosGeneticos1.randomizarFatorCorte(cadeia1));
        System.out.println("Resultado da Combinação:");
        System.out.println(cadeia1);
        System.out.println(cadeia2);
        System.out.println("==========================");

        String[] filhos = AlgoritmosGeneticos.recombinacao(cadeia1, cadeia2);
        System.out.println("Resultado da Mutação:");
        System.out.println("Indice Aleatorio na mutacao: " + AlgoritmosGeneticos1.randomizarFatorCorte(filhos[0]));
        System.out.println(filhos[0]);
        System.out.println(filhos[1]);
        System.out.println("==========================");

        scanner.close();
    }
}
