package probando;

import java.util.Scanner;

/*
 Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
 Si el segundo número es 0, debe mostrar un mensaje de error.
 */
public class Division 
{
	public static void main(String[]args) {
		int numerador, denominador;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce primer número: ");
		numerador = sc.nextInt();
		System.out.println("Introduce segundo número: ");
		denominador =sc.nextInt();
		
		if(denominador !=0) {
			System.out.println((double)numerador / (double) denominador);
		}
		else {
			System.out.println("Error. El segundo número es 0");
		}
	}
}
