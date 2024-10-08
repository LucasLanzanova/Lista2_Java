package Lista2;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        scanner.nextLine();  
        System.out.print("Digite o mês de referência: ");
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

        System.out.println("\n--- Informações do Funcionário ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Mês de referência: " + mesReferencia);
        System.out.println("Salário total: R$ " + String.format("%.2f", salarioFinal));

        if (horasExtras > 0) {
            System.out.println("Horas extras: " + horasExtras + " horas");
            System.out.println("Valor por hora extra: R$ " + String.format("%.2f", valorHoraExtra));
        } else {
            System.out.println("Não houve horas extras.");
        }

        scanner.close();
    }
}