package JuegoAhorcado;

import JuegoAhorcado.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class JuegoAhorcado {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Random r = new Random(); //Numero ramdom.
       String[] palabras = {"camello","arbol","domino","calculo", "pelicula", "jornada", "camaron", "delfin", "elefante"}; //Arreglo de palabras.
       int palabraAleatoria = r.nextInt(palabras.length); //Conversion variable r en integer.
       
       //Declaracion del Objeto.
       Ahorcado pro = new Ahorcado(); 
       
       //Objetos.
       pro.Cadena(palabras, palabraAleatoria); //Convierte la cadena string a char.
       pro.OcultarCadena(); //Ocultacion de la palabra.
       
       for(int i = 1; i <= 8; i++){
           pro.Juego(entrada, i);
           System.out.println(Arrays.toString(pro.getCadenaJuego())); 
           pro.Verificacion(i);
       }
    }
}