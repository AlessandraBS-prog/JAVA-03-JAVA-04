package exercicios;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();

        System.out.print("Nota 3: ");
        nota3 = scanner.nextFloat();

        System.out.print("Nota 4: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f\n", media);

        scanner.close();
    }
}
