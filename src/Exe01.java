import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String stringDigitada = scanner.nextLine();
        int stringNum = stringDigitada.length();
        System.out.println("O número de caracteres do nome é: " + stringNum);
        String stringMaiuscula = stringDigitada.toUpperCase();
        System.out.println("O nome em maiúsculo é: " + stringMaiuscula);
        int vogaisNum = UtilitariaExe01.contarVogais(stringDigitada);
        System.out.println("O número do vogais usadas no nome é: " + vogaisNum);
        if (stringDigitada.toLowerCase().startsWith("inf")) {
            System.out.println("O nome começa com 'INF'.");
        } else {
            System.out.println("0 nome não começa com 'INF'.");
        }
        if (stringDigitada.toLowerCase().endsWith("net")) {
            System.out.println("O nome termina com 'NET'.");
        } else {
            System.out.println("0 nome não termina com 'INF'.");
        }
        int numDigitos = UtilitariaExe01.numDigitos(stringDigitada);
        System.out.println("O número de digitos de 0-9 usados foram: "+ numDigitos);
        String string2Digito = stringDigitada.substring(0,2);
        System.out.println("Os dois primeiros digitos são: " + string2Digito);
        boolean ehPalindromo = UtilitariaExe01.stringPalindromo(stringDigitada);
        if(ehPalindromo == true){
            System.out.println("A palavra é um palíndromo!");
        }else{
            System.out.println("A palavra não é um palíndromo!");
        }
        scanner.close();
    }
}