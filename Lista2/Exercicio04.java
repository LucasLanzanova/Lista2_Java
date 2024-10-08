package Lista2;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio04 {
        public static void main(String[] args) {
    

        Scanner s = new Scanner(System.in);

       
        System.out.print("Digite a altura (em metros): ");
        double altura = s.nextDouble();
        
        System.out.print("Digite o peso (em kg): ");
        double pesoAtual = s.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino ou F para feminino): ");
        char sexo = s.next().toUpperCase().charAt(0);

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Utilize M para masculino ou F para feminino.");
            return;
        }

        String categoria;
        if (pesoAtual < pesoIdeal) {
            categoria = "abaixo do peso ideal";
        } else if (pesoAtual == pesoIdeal) {
            categoria = "no peso ideal";
        } else {
            categoria = "acima do peso ideal";
        }

        // Exibe os resultados
        System.out.printf("Peso Ideal: %.2f kg%n", pesoIdeal);
        System.out.println("Você está " + categoria + ".");

    }
}