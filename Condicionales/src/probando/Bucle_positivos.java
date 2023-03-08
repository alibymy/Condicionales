package probando;

import java.util.Scanner;

/*
 Hacer un programa que solicite números hasta que se teclee uno negativo, y a continuación 
muestre cuántos números positivos se han introducido
 */
public class Bucle_positivos 
{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador=0;
		do {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			if (numero >=0) {
				contador++;
			}
			
			}
		while (numero >=0);
		
		if(numero<=0) {
			System.out.println("Los números introducidos son: " + contador);
		}
	}		
}


