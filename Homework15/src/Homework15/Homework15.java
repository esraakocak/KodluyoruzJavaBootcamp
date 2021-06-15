package Homework15;


import java.util.Scanner;

public class Homework15 {

	public static void main(String[] args) {
	    int number ;
	    int sum =0;
	    int sayac=0;
	    double average=0.0;
	    Scanner inp = new Scanner(System.in);
	    System.out.println("bir sayý giriniz");
	    number = inp.nextInt();
	    for(int i =0; i<=number; i++) {
	        if(i%3==0 && i% 4==0) {
	        	sayac++;
	           sum +=i;
	        	average =sum/sayac;
	        	
	    	
	       }
	      
	    
	    }
	    System.out.println("ortalama :"+average);
	}

}
