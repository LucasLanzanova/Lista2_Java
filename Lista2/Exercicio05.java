package Lista2;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio05 {
    
        public static void main(String[] args){
            
            int idade;
            Scanner s = new Scanner(System.in);
            
            System.out.print("Digite sua idade:");
            idade = s.nextInt();
            
            if (idade >= 16) {
                
                System.out.println("Tem idade para votar");
                
            } else {
                System.out.println("não tem idade para votar");
            }
            
            if (idade >= 18){
                
                System.out.println("tem idade para tirar habilitação");
                
            } else {
                
                System.out.println("não tem idade para tirar habilitação");
                
            }
            
        }
}
