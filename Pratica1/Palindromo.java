
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true) {
            
            System.out.println("Digite uma palavra ou digite 2 para sair");
            input = scanner.nextLine();

            
            if(input.equalsIgnoreCase("2")) {
                break;
            }
            
            String Formatado = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
            if(epalindromo(Formatado)) {
                System.out.println("É um palíndromo!");
            } else {
                System.out.println("Não é um palíndromo.");
            }

            System.out.println();
       
        }
        scanner.close();
    }

    public static boolean epalindromo(String str) {
        int inicio = 0;
        int fim = str.length() -1;

        while(inicio < fim) {
            if(str.charAt(inicio) != str.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    } 
}