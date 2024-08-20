/**                                                                             
 * @author Hanabi Hernández Arce                                                
 * @version 1.0                                                                 
 * @date 20 aug 2024                                                            
 */                                                                             
                                                                                
import java.util.Scanner;                                                       
public class Practica03 {                                                       
    public static void main(String[]pps){                                       
        Scanner teclado = new Scanner(System.in);                               
        System.out.println("Nombre del mamador");                                
        String mamador = teclado.nextLine();                                   
        System.out.println("Nombre: "+mamador+ " xD");
        float n = 1000000000000000000000000000000000001.f;
        String r = (n % 2 == 0) ? "Par" : "Impar";
        System.out.println(r);                                                                      
        if(n%2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }                                                                           
}                                                                               

