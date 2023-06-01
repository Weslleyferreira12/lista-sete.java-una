import java.util.Scanner;

public class ListaSeteExTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cpf;

        System.out.println("\nValidação de CPF");

        System.out.println("\nDigite seu CPF(números e caracteres):");
        cpf = scanner.nextLine();
        
        if (validarCPF(cpf)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
        scanner.close();
    }
    
    public static boolean validarCPF(String cpf) {
        
        cpf = cpf.replace(".", "").replace("-", "");
        
        if (cpf.length() != 11) {
            return false;
        }
        
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
        
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }
        
        return Integer.parseInt(String.valueOf(cpf.charAt(9))) == digito1 &&
                Integer.parseInt(String.valueOf(cpf.charAt(10))) == digito2;
    }
    
}