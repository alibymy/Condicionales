package probando;

import java.util.Scanner;

//Realizar un programa que, dado un número entero, positivo, indique cuantas cifras tiene.

public class Bucle_Cifras
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Introduce un número");
	    long numero = s.nextLong();
	    int contadorCifras = 0;
	    do{
	        numero /=10;
	        contadorCifras++;
	    }
	    while(numero!=0);
	    System.out.println(contadorCifras);
	}
}
