package practica1;

import java.util.Scanner;

public class practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número a evaluar: "); //El número que será evaluado
		
		try{
			  
			long x=sc.nextLong();
			System.out.println(x+" puede ser almacenado es:");
			
			if(x>= Byte.MIN_VALUE && x<=Byte.MAX_VALUE)	{
				System.out.println("(*)byte");
				}
			if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println("(*) short");
			    }
			if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("(*) int");
                }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("(*) long");
                }
            
            Scanner.close();
			 
			
			
			
		
	
		
		
			
		}

	}

}
