package JuegoAhorcado;

import java.util.Arrays;
import java.util.Scanner;

class Ahorcado {
	char cadena[];
    char cadenaJuego[];
    char intento;
    String[] palabras;
    
    public char[] getCadena() {
        return cadena;
    }

    public char[] getCadenaJuego() {
        return cadenaJuego;
    }

    public void setCadena(char[] cadena) {
        this.cadena = cadena;
    }

    public void setCadenaJuego(char[] cadenaJuego) {
        this.cadenaJuego = cadenaJuego;
    }
    
    public void Cadena(String[] palabras, int tama�o){
        cadena = palabras[tama�o].toCharArray(); //Metodo para convertir un String en un Char.
        cadenaJuego = palabras[tama�o].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i< cadenaJuego.length; i++){ //Ocultacion de palabra.
            cadenaJuego[i] = '_';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(cadenaJuego));
    }
    
    public void Juego(Scanner en, int i){
        System.out.print(i + " -Intento: ");
        intento = en.next().charAt(0);
          for(int x = 0; x < cadena.length ;x++){ //Verificacion del entrada con la palabra escondida.
                if(cadena[x]==intento){
                 cadenaJuego[x] = intento;
                }
           } 
    }
    
    public void Verificacion(int i){
         if(Arrays.equals(cadena, cadenaJuego)){
                System.out.println("\nFelicidades Adivinaste la Palabra .");
                 i = 8; //Fin de juego.
            }else if(i==8){
                System.out.println("\nLo Siento. Has Perdido");
                System.exit(0); //Finaliza un programa.
          }
    }
}
