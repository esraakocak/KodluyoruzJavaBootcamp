package Homework7;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
	    double kilo,armut=2.14, elma=3.67, domates=1.11, muz=0.95,patl�can=5.00;
	    
	    Scanner inp= new Scanner(System.in);
	  
	    System.out.print("Armut ka� kilo? ");
	    kilo=inp.nextDouble();
	  //  System.out.print(kilo);
	    double sonucArmut=kilo*armut;
	    
	    System.out.println(" ");
	    
	    System.out.print("elma ka� kilo? ");
	    kilo=inp.nextDouble();
	    double sonucElma=kilo*elma;
	    
	    System.out.println(" "); 
	    
	    System.out.print("domates ka� kilo? :");
	    kilo=inp.nextDouble();
	    double sonucDomates=kilo*domates;
	    
	    System.out.println(" "); 
	    
	    System.out.print("muz ka� kilo?  :");
	    kilo=inp.nextDouble();
	    double sonucMuz=kilo*muz;
	    
	   System.out.println(" ");
	   System.out.print("patl�can ka� kilo?  :");
	    kilo=inp.nextDouble();
	    double sonucPatl�can=kilo*patl�can;
	    
	    
	    double toplam=sonucArmut+sonucDomates+sonucElma+sonucMuz+sonucPatl�can;
	    System.out.println("toplam tutar : "+toplam);
	    
	    
	
	   
	    
	    

	}

}
