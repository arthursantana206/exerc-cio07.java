// Nome: Arthur Gabriel Santana dos Santos 
// Matrícula: 1261940088

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 100): ");
        double nota = input.nextDouble();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Tente novamente.");
            System.out.print("Digite a nota (0 a 100): ");
            nota = input.nextDouble();
        }

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 75) {
            System.out.println("Conceito: B");
        } else if (nota >= 60) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D (Reprovado)");
        }

        input.close();
    }
}
