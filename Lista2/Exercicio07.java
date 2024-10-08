package Lista2;
import java.time.Month;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio07 {
       
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o m�s (1 a 12): ");
        int mes = s.nextInt();
        
        if (mes < 1 || mes > 12) {
            System.out.println("Valor Inv�lido");
            return;
        }
        
        LocalDate dataAtual = LocalDate.now();
        int mesAtual = dataAtual.getMonthValue();
        
        String nomeMes = Month.of(mes).name().toLowerCase();
        nomeMes = nomeMes.substring(0, 1).toUpperCase() + nomeMes.substring(1);
        
        String relacao;
        if (mes < mesAtual) {
            relacao = "m�s j� passou";
        } else if (mes == mesAtual) {
            relacao = "� m�s atual";
        } else {
            relacao = "m�s Futuro";
        }
        
        System.out.println(nomeMes);
        System.out.println(relacao);
        
    }
 
    
}

