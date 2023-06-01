import java.util.Scanner;

public class ListaSeteExUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringUm, stringDois;
        System.out.println("\nLer strings");

        System.out.println("\nInforme a primeira string:");
        stringUm = scanner.nextLine();

        System.out.println("\nInforme a segunda string:");
        stringDois = scanner.nextLine();

        int tamanhoStringUm = stringUm.length();
        int tamanhoStringDois = stringDois.length();

        System.out.println("\nCompara duas strings");
        System.out.println("Tamanho de " + stringUm + ": " + tamanhoStringUm + " caracteres");
        System.out.println("Tamanho de " + stringDois + ": " + tamanhoStringDois + " caracteres");

        if (tamanhoStringUm == tamanhoStringDois) {
            System.out.println("\nAs duas strings são de tamanhos iguais.");
        }
        else {
            System.out.println("\nAs duas strings são de tamanhos diferentes.");
        }

        if (stringUm.equalsIgnoreCase(stringDois)) {
            System.out.println("\nAs duas strings possuem conteúdo iguais.");
        }
        else {
            System.out.println("\nAs duas strings possuem conteúdo diferente.");
        }
        scanner.close();
    }
}