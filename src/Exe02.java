import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numDigitado = scanner.nextInt();
        String numDigitadoStr = Integer.toString(numDigitado);
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < numDigitadoStr.length(); i++) {
            char digitoChar = numDigitadoStr.charAt(i);
            if (Character.isDigit(digitoChar)) {
                int digito = Character.getNumericValue(digitoChar);
                String extenso = UtilitariaExe02.NumeroPorExtensoUtil.converterParaExtenso(digito);
                resultado.append(extenso);
                if (i < numDigitadoStr.length() - 1) {
                    resultado.append(", ");
                }
            }
        }
            System.out.println("Resultado: " + resultado.toString());
            scanner.close();
    }
}

