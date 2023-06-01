import java.util.Scanner;

public class ListaSeteExDois {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome, nomeFinal;

    System.out.println("\nImprimir nome ao contrário em letras maiúsculas");
    System.out.println("\nDigite o seu nome:");
    nome = scanner.nextLine();

    StringBuilder reversed = new StringBuilder(nome);
    reversed.reverse();

    nomeFinal = reversed.toString().toUpperCase();

    System.out.println(nomeFinal);
    scanner.close();
  }
}