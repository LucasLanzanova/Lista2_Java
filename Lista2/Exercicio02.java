package Lista2;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matr�cula do funcion�rio: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o n�mero de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        scanner.nextLine();  
        System.out.print("Digite o m�s de refer�ncia: ");
        String mesReferencia = scanner.nextLine();

        final int HORAS_NORMAIS = 200;
        double salarioBase;
        double salarioFinal;
        double valorHoraExtra = 0;
        int horasExtras = 0;

        if (horasTrabalhadas > HORAS_NORMAIS) {
            horasExtras = horasTrabalhadas - HORAS_NORMAIS;
            valorHoraExtra = valorHora * 1.5;
            salarioBase = HORAS_NORMAIS * valorHora;
            salarioFinal = salarioBase + (horasExtras * valorHoraExtra);
        } else {
            salarioFinal = horasTrabalhadas * valorHora;
        }

        System.out.println("\n--- Informa��es do Funcion�rio ---");
        System.out.println("Matr�cula: " + matricula);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("M�s de refer�ncia: " + mesReferencia);
        System.out.println("Sal�rio total: R$ " + String.format("%.2f", salarioFinal));

        if (horasExtras > 0) {
            System.out.println("Horas extras: " + horasExtras + " horas");
            System.out.println("Valor por hora extra: R$ " + String.format("%.2f", valorHoraExtra));
        } else {
            System.out.println("N�o houve horas extras.");
        }

        scanner.close();
    }
}