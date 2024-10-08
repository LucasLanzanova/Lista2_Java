package Lista2;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = s.nextInt();

        String categoria;

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Adulto";
        } else {
            categoria = "Idade inválida para classificação.";
        }
        System.out.println("Classificação do nadador: " + categoria);

    }   
}
