package Homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		System.out.println("üçgenin kenar uzunluklarýný giriniz");
		
		    int a ;
		    int b;
		    int c ;
			Scanner inp = new Scanner(System.in);
			a = inp.nextInt();
			 b = inp.nextInt();
			 c =inp.nextInt();
			
		    int u =(a+b+c)/2;
		   double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		    System.out.println("üçgenin alaný: " +alan);
		  
		    
	
		}
	

}
