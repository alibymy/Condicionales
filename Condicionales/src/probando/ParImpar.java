package probando;

import java.util.Scanner;

/*
 Realiza un programa que pida un número por teclado y nos indique si es par o impar.
 */
public class ParImpar 
{
	public static void main(String[]args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número: ");
		numero = sc.nextInt();
		
		if(numero %2 ==0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
	}
}
