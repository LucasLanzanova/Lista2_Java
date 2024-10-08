package Lista2;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio09{
        public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = s.nextDouble();

        System.out.print("Digite o código da condição de pagamento (1 a 4): ");
        int codigoCondicao = s.nextInt();
        
        double valorFinal = 0;
        int parcelas = 0;
        double valorParcela = 0;
        
        if (codigoCondicao == 1) { 
            valorFinal = valorTotal * 0.90;
            parcelas = 1;
            valorParcela = valorFinal;
        } else if (codigoCondicao == 2) { 
            valorFinal = valorTotal * 0.92;
            parcelas = 1;
            valorParcela = valorFinal;
        } else if (codigoCondicao == 3) { 
            valorFinal = valorTotal;
            parcelas = 5;
            valorParcela = valorFinal / parcelas;
        } else if (codigoCondicao == 4) { 
            valorFinal = valorTotal * 1.05;
            parcelas = 10;
            valorParcela = valorFinal / parcelas;
        } else {
            System.out.println("Código de condição de pagamento inválido.");
            return;
        }
     
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorFinal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.printf("Valor por parcela: R$ %.2f%n", valorParcela);
    }
}

