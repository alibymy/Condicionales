package probando;

import java.util.Scanner;

/*
 Realizar un programa que, dado un número entero entre 0 y 99.999, indique cuantas cifras
tiene.
 */
public class Cifras 
{
	public static void main(String[]args) {
		int cifra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 99.999 : ");
		cifra = sc.nextInt();
       	
		if (cifra <10) {
			System.out.println("Tiene una cifra");
		}
		else if (cifra<100) {
			System.out.println("Tiene dos cifras");
		}
		else if (cifra<1000) {
			System.out.println("Tiene tres cifras");
		}
		else if (cifra<10000) {
			System.out.println("Tiene cuatro cifras");
		}
		else if (cifra<100000){
			System.out.println("Tiene cinco cifras");
		}
		else {
			 System.out.println("Error");
		}
		
	}
}
