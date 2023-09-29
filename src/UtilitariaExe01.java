public class UtilitariaExe01 {
    public static int contarVogais(String stringVogais) {
        int qntVogais = 0;
        stringVogais = stringVogais.toLowerCase();
        for (int i = 0; i < stringVogais.length(); i++) {
            char letra = stringVogais.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qntVogais++;
            }
        }
        return qntVogais;
    }
    public static int numDigitos(String stringDigitos){
        int qntDigitos = 0;
        for(int i = 0; i < stringDigitos.length(); i++){
            char digito = stringDigitos.charAt(i);
            if(Character.isDigit(digito)){
                qntDigitos++;
            }
        }
        return qntDigitos++;
    }
    public static String stringReverse(String stringDigitada) {
        return new StringBuilder(stringDigitada).reverse().toString();
    }
    public static boolean stringPalindromo(String stringDigitada){
        boolean palindromo = false;
        String stringDigitadaSemEsp = stringDigitada.trim().replace(" ", "");
        System.out.println(stringDigitadaSemEsp);
        String stringRevertida = (stringReverse(stringDigitadaSemEsp)).trim().replace(" ", "");
        if(stringDigitadaSemEsp.equals(stringRevertida)){
            return palindromo = true;
        }
        return palindromo;
    }
}
