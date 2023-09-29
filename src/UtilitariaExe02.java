public class UtilitariaExe02 {
    public class NumeroPorExtensoUtil {
        private static final String[] unidades = {
                "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
        };

        public static String converterParaExtenso(int numDigitado) {
            if (numDigitado < 0 || numDigitado > 9) {
                return "Número fora do intervalo (0-9)";
            }
            return unidades[numDigitado];
        }
    }
}
