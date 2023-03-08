package probando;
import java.util.Scanner;
/*
  Bucles repetitivos

Se tiene que calcular la media de los datos que un usuario introduzca por teclado.
 La media es la suma de los números introducidos entre la cantidad de números que se han ingresado.

El programa estará todo el rato pidiendo datos hasta que se introduzca el número -999, 
que provocará el fin de entrada de datos y se producirá el cálculo de la media.
 */
public class Bucles {


	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int suma =0;
		int contador=0;
		int numero;
		
		do {
			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			if(numero != -999) {
				suma += numero;
				contador ++;
			}
			
		}
		while (numero != -999);
		System.out.println("La media es: " + (double)suma/contador);
	}
}





