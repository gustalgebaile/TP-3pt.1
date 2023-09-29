import java.util.Random;

public class CadeiaDeDna {
    public static String gerarCadeiaDeDna(int tamanho) {
        StringBuilder cadeia = new StringBuilder();
        Random random = new Random();
        String[] bases = {"A", "C", "G", "T"};

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(bases.length);
            cadeia.append(bases[indice]);
        }

        return cadeia.toString();
    }
}
