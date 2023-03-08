package probando;

import java.io.IOException;
import java.util.Scanner;

/*
  Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
  ALGORITMO
    - LEER cadena
    - Cálculos
    *   si longitud cadena != 1 --> No es una letra mayúscula
    *       si cadena > A y <Z --> Es una letra mayúscula
            sino --> No es una letra mayúscula
 */
public class LetraMayus 
{
	public static void main(String[]args) {
		String letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce letra: ");
		letra = sc.nextLine();
		
		if(letra.length() !=1) {
			System.out.println("La letra no es Mayuscula");
		}
		 // }else if ((cadena > "A") && (cadena < "Z"))
		else if((letra.compareTo("A")>=0) && (letra.compareTo("Z")<=0)) {
			System.out.println("La letra es Mayuscula");
		}
		else {
			System.out.println("La letra no es Mayúscula");
		}
	}
	/*public static void main(String[] args) throws IOException {
        char car;
        System.out.print("Introduzca un carácter: ");
        car = (char) System.in.read(); //lee un solo caracter

        if (Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character        
        {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
    }*/
}
