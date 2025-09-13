package exercicios;
import java.util.Scanner;

public class DiferencaEntreValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valor1, valor2, diferenca;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextFloat();

        diferenca = Math.abs(valor1 - valor2);

        System.out.printf("Diferença entre os valores: %.2f\n", diferenca);

        scanner.close();
    }
}
