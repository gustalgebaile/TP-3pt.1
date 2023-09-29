import java.util.Random;

public class AlgoritmosGeneticos {
    public static String[] recombinacao(String s1, String s2) {
        Random random = new Random();
        int pontoDeCorte = random.nextInt(Math.min(s1.length(), s2.length()));
        String filho1 = s1.substring(0, pontoDeCorte) + s2.substring(pontoDeCorte);
        String filho2 = s2.substring(0, pontoDeCorte) + s1.substring(pontoDeCorte);

        return new String[]{filho1, filho2};
    }

    public static String mutacao(String s) {
        Random random = new Random();
        int posicaoMutacao = random.nextInt(s.length());
        String[] bases = {"A", "C", "G", "T"};
        String baseMutada = bases[random.nextInt(bases.length)];
        StringBuilder mutacao = new StringBuilder(s);
        mutacao.setCharAt(posicaoMutacao, baseMutada.charAt(0));
        return mutacao.toString();
    }

    public static int randomizarFatorCorte(String s) {
        Random random = new Random();
        return random.nextInt(s.length());
    }
}
