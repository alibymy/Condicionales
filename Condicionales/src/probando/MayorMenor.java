package probando;

import java.util.Scanner;
/*
 Realizar un programa que lea tres números de teclado y a continuación los muestre 
ordenados de mayor a menor.
 */
public class MayorMenor {
	public static void main(String[]args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduce segundo numero");
		num2 = sc.nextInt();
		System.out.println("Introduce tercer numero");
		 num3 = sc.nextInt();
		
		 
		 if(num1>num2 && num2>num3)
	         System.out.println( num1+", "+num2+", "+num3);
	     else{
	         if(num1>num3 && num3>num2)
	             System.out.println(num1+", "+num3+", "+num2);
	         else{
	            if(num2>num1 && num1>num3)
	                System.out.println(num2+", "+num1+", "+num3);
	            else{
	               if(num2>num3 && num3>num1)
	                   System.out.println(num2+", "+num3+", "+num1);
	               else{
	                   if(num3>num1 && num1>num2)
	                      System.out.println(num3+", "+num1+", "+num2);
	                   else{
	                      if(num3>num2 && num2>num1)
	                         System.out.println(num3+", "+num2+", "+num1);
	                     }
	                   }
	                }
	             }
	         }
	}
}
