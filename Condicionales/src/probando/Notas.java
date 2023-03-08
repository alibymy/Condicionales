package probando;

import java.util.Scanner;

/*. Realizar un programa que, dada la nota numérica de la asignatura, un valor entero
comprendido entre 0 y 10, muestre la nota cualitativa de la forma: Suspenso, Aprobado, 
Notable, Sobresaliente.*/
public class Notas 
{
	public static void main (String []args) {
		int nota;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce nota");
		nota = sc.nextInt();
		switch (nota) {
		case 0,1,2,3,4 : 
			System.out.println("Suspenso");
		break;
		case 5,6 : 
			System.out.println("Aprobado");
		break;
		case 7,8 : 
			System.out.println("Notable");
		break;
		case 9,10 : 
			System.out.println("Sobresaliente");
		break;
		default : 
		
		}
		
	}
}
