
package ejercicio1;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        
Scanner teclado= new Scanner(System.in);

        String NuevaPalabra;
        palindromo objclass=new palindromo();
        System.out.print("Ingresa una palabra: ");
        NuevaPalabra = teclado.nextLine();
        
        if(objclass.espalindromo(NuevaPalabra)){
            System.out.println("Es Palindromo: "+ NuevaPalabra);
        }
        else
        {
            System.out.println("No es Palindromo "+NuevaPalabra);
        }
    }
    
}