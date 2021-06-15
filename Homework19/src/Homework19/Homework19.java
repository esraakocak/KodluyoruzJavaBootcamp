package Homework19;

import java.util.Scanner;

public class Homework19 {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	        System.out.print("Taban Sayi Gir: ");
	        int sayiTaban = inp.nextInt();
	        int a = sayiTaban;
	        System.out.print("Üs olan sayiyi gir: "); 
	        int usSayi = inp.nextInt();
	        for(int i=1;i<usSayi;i++){
	            a = sayiTaban*a;
	        }
	        System.out.println("Sonuc: "+a);
	        
	    

	}


}