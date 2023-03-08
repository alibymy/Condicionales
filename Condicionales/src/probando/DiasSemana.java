package probando;

import java.util.Scanner;

/*
 Se desea realizar un programa que dependiendo del número del día de la semana que se introduzca por teclado,
  se le devolverá el día que tiene asignado: 1 es lunes, 2 es martes, ..., 7 es domingo.
 */
public class DiasSemana 
{
	public static void main(String[]args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número del 1 al 7: ");
		dia = sc.nextInt();
		System.out.println("El dia de la semana es: ");
		switch(dia) {
		case 1 :
			System.out.println("Lunes");
			break;
		case 2 :
			System.out.println("Martes");
			break;
		case 3 :
			System.out.println("Miercoles");
			break;
		case 4 :
			System.out.println("Jueves");
			break;
		case 5 :
			System.out.println("Viernes");
			break;
		case 6 :
			System.out.println("Sabado");
			break;
		case 7 :
			System.out.println("Domingo");
			break;
		default:System.out.println("error");
		} 
	}
	
}
