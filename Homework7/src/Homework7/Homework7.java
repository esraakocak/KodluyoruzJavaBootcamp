package Homework7;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
	    double kilo,armut=2.14, elma=3.67, domates=1.11, muz=0.95,patlýcan=5.00;
	    
	    Scanner inp= new Scanner(System.in);
	  
	    System.out.print("Armut kaç kilo? ");
	    kilo=inp.nextDouble();
	  //  System.out.print(kilo);
	    double sonucArmut=kilo*armut;
	    
	    System.out.println(" ");
	    
	    System.out.print("elma kaç kilo? ");
	    kilo=inp.nextDouble();
	    double sonucElma=kilo*elma;
	    
	    System.out.println(" "); 
	    
	    System.out.print("domates kaç kilo? :");
	    kilo=inp.nextDouble();
	    double sonucDomates=kilo*domates;
	    
	    System.out.println(" "); 
	    
	    System.out.print("muz kaç kilo?  :");
	    kilo=inp.nextDouble();
	    double sonucMuz=kilo*muz;
	    
	   System.out.println(" ");
	   System.out.print("patlýcan kaç kilo?  :");
	    kilo=inp.nextDouble();
	    double sonucPatlýcan=kilo*patlýcan;
	    
	    
	    double toplam=sonucArmut+sonucDomates+sonucElma+sonucMuz+sonucPatlýcan;
	    System.out.println("toplam tutar : "+toplam);
	    
	    
	
	   
	    
	    

	}

}
