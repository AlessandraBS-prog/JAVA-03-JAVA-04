package exercicios;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salarioBruto, adicional, descontos, salarioLiquido;

        System.out.print("Salário bruto: ");
        salarioBruto = scanner.nextFloat();

        System.out.print("Adicional: ");
        adicional = scanner.nextFloat();

        System.out.print("Descontos: ");
        descontos = scanner.nextFloat();

        salarioLiquido = salarioBruto + adicional - descontos;

        System.out.printf("Salário líquido: %.2f\n", salarioLiquido);

        scanner.close();
    }
}
