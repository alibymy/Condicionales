package probando;

import java.util.Scanner;

/*
 . Realizar un programa en java que, dado el día, mes y año de una fecha, indique si la fecha es
correcta (sin considerar años bisiestos).
 */
public class Fecha
{
    public static void main(String[]args) {
    	int d,m,a;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("El dia es: " );
    	d = sc.nextInt();
    	System.out.println("El mes es: ");
    	m = sc.nextInt();
    	System.out.println("El año es: ");
    	a = sc.nextInt();
    	
    	if(d>=1 && d <=31) {
    		if(m>=1 && m<=12) {
    			if(a>0 && a<=9999) {
    				System.out.println("La fecha es correcta: " + d +"/" + m +"/"+a);
    			}
    		}
    	}
    	else {
    		System.out.println("La fecha es incorrecta");
    	}
    }
}

