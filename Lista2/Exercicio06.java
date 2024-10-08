package Lista2;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = s.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = s.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = s.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = valor1 + valor2;
                System.out.printf("%.2f + %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '-':
                resultado = valor1 - valor2;
                System.out.printf("%.2f - %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '*':
                resultado = valor1 * valor2;
                System.out.printf("%.2f * %.2f = %.2f%n", valor1, valor2, resultado);
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.printf("%.2f / %.2f = %.2f%n", valor1, valor2, resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Símbolo inválido.");
                break;
        }
    }
}
