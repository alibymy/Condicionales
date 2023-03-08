package probando;

import java.util.Scanner;

/*
 Realizar un programa que lea dos números por teclado y a continuación los muestre 
ordenados de menor a mayor.
 */
public class MenorMayor 
{
	public static void main(String[]args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce segundo número: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println(num1 + "," + num2);
		}
		else {
			System.out.println(num2 + "," + num1);
		}
		
}
}
