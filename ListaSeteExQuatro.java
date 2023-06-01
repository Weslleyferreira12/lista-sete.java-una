import java.util.Scanner;

public class ListaSeteExQuatro {
    private static final String[] unidades = {
        "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
        "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String[] dezenas = {
        "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    private static final String[] centenas = {
        "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt();

        String extenso = converterParaExtenso(numero);
        System.out.println(extenso);
        scanner.close();
    }

    public static String converterParaExtenso(int numero) {
        if (numero < 20) {
            return unidades[numero];
        }

        if (numero < 100) {
            int unidade = numero % 10;
            int dezena = numero / 10;
            String extenso = dezenas[dezena];
            if (unidade > 0) {
                extenso += " e " + unidades[unidade];
            }
            return extenso;
        }

        if (numero < 1000) {
            int unidade = numero % 10;
            int dezena = (numero / 10) % 10;
            int centena = numero / 100;
            String extenso = centenas[centena];
            if (dezena > 0) {
                extenso += " e " + dezenas[dezena];
            }
            if (unidade > 0) {
                extenso += " e " + unidades[unidade];
            }
            return extenso;
        }
        return "Número fora do intervalo suportado.";
    }
}