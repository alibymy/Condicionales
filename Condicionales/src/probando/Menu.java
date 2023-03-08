package probando;

import java.util.Scanner;

public class Menu 
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. De 4 números: Sumar los dos primeros y multiplicar los dos últimos.");
            System.out.println("2. De 4 valores: Sumatorio y promedio.");
            System.out.println("3. De un cuadrado: El perímetro.");
            System.out.println("4. De dos números: Si A>B, suma y diferencia; Si A<B; multiplicar y dividir.");
            System.out.println("5. De 3 números: Mostrar el mayor");
            opcion = s.nextInt();
            switch (opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: 
            }
        }while(opcion<=5&&opcion>=1);
        System.out.println("Error");
    }
	public static void caso1(){
		Scanner sc = new Scanner(System.in);
		int numero;
		
			
		
	}

}


