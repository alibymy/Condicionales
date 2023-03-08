package probando;

import java.util.Scanner;

/*
 Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA
 */
public class Solicitud
{ 
	public static void main(String []args) {
		int edad, nota;
		String sexo;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce edad: ");
		edad = sc.nextInt();
		System.out.println("Introduce nota: ");
		nota = sc.nextInt();sc.nextLine();
		System.out.println("Introduce sexo(M o F): ");
		sexo = sc.nextLine();
		
		if(!sexo.toUpperCase().equals("F") && (!sexo.toUpperCase().equals("M"))){//equals o == es comparar.
			System.out.println("El valor del sexo es incorrecto.");
		}
		else if ((nota>=5) && (edad >=18) && (sexo.toUpperCase().equals("M"))){
			System.out.println("POSIBLE");
		}
		else if ((nota>=5) && (edad >=18) && (sexo.toUpperCase().equals("F"))){
			System.out.println("ACEPTADA");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
}
}