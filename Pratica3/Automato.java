//wesleydiasmaciel@gmail.com
package Pratica3;
import java.util.Scanner;

public class Automato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva a palavra que deseja verificar: ");
        String palavra = scanner.nextLine();
        scanner.close();

        if (checaPalavra(palavra)) {
            System.out.println("Palavra aceita");
        } else {
            System.out.println("Palavra não aceita");
        }
    }

    public static boolean checaPalavra(String palavra) {
        // Estado inicial
        String estado = "q0"; 

        for (char simbolo : palavra.toCharArray()) {
            switch (estado) {

                case "q0":
                    if (simbolo == 'a') estado = "s3";
                    else if (simbolo == 'b') estado = "q0";
                    else return false;
                    break;

                case "s3":
                    if (simbolo == 'a') estado = "s6";
                    else if (simbolo == 'b') estado = "q0";
                    else return false;
                    break;

                case "s4":
                    if (simbolo == 'a') estado = "s6";
                    else if (simbolo == 'b') estado = "s4";
                    else return false;
                    break;

                case "s6":
                    if (simbolo == 'a') estado = "s6";
                    else if (simbolo == 'b') estado = "s4";
                    else return false;
                    break;
            }
        }
        // Estados finais
        return estado.equals("s4") || estado.equals("s6"); 
    }
}
