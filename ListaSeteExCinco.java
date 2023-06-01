import java.util.Scanner;

public class ListaSeteExCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String telefone;

        System.out.println("\nDigite um número de telefone");
        telefone = scanner.nextLine();

        System.out.println("\nValida e corrige número de telefone");
        System.out.println("Telefone: " + telefone);

        String telefoneSemTraco = telefone.replace("-", "");
        int tamanhoTelefone = telefoneSemTraco.length();

        if (tamanhoTelefone == 8) {
            System.out.println("O telefone possui 8 dígitos");
            System.out.println("Vou acrescentar o digito 9 na frente.");
            System.out.println("Telefone corrigido sem formatação: 9" +telefoneSemTraco);

            StringBuilder builder = new StringBuilder(telefoneSemTraco);
            int colocarTraco = builder.length() / 2;
            String traco = "-";
            builder.insert(colocarTraco, traco);
            String telefoneComTraco = builder.toString();
            System.out.println("Telefone corrigido com formatação: 9" +telefoneComTraco);
        }
        else {
            System.out.println("O telefone possui 9 dígitos");
        }
        scanner.close();
    }
}