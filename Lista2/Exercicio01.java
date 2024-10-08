package Lista2;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio01 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        double raioR;
        
        System.out.print("Digite o valor do raio da esfera:");
        raioR = s.nextDouble();
        
        System.out.print("Volume da esfera:" + (4/3*Math.PI*Math.pow(raioR,3)));
        
        
    }
}
