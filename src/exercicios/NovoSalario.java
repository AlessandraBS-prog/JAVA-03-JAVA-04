package exercicios;
import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salario, abono, novoSalario;

        System.out.print("Digite o salário: ");
        salario = scanner.nextFloat();

        System.out.print("Digite o abono: ");
        abono = scanner.nextFloat();

        novoSalario = salario + abono;

        System.out.printf("Novo salário: %.2f\n", novoSalario);

        scanner.close();
    }
}
