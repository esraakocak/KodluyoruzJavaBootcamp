package Homework9;

import java.util.Scanner;

public class Homework9 {
	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
	        System.out.print("Sýcaklýk derecesini giriniz: ");
	       int heat = inp.nextInt();
	        if (heat<=5){
	            System.out.println("Kayak");
	        }else if(heat>5 || heat<=15){
	            System.out.println("Sinema");
	        }else if(heat>10 || heat<=25){
	            System.out.println("Piknik");
	        }else if(heat>25){
	            System.out.println("Yüzme");
	        }
	    }
	}


