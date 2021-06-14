package Homework2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
	

		double tutar;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("ücret tutarýný giriniz");
		tutar =inp.nextDouble();
	if(tutar==0 || tutar <1000) {
		System.out.println("girilen  tutar 0 ve 1000 TL arasýnda  ");
	
		
		System.out.println("KDV oraný %18 "+kdvTutar(tutar,kdvOran));
		
	}else {
		System.out.println("girilen tutar 1000 TL den büyük");
	
	
		System.out.println("KDV oraný %8 "+kdvTutar2(tutar, kdvOran2));
	}
	
	
}

	 public static double kdvTutar(double tutar,double kdvOran) {
		 return tutar = tutar * kdvOran ;
	 }
	 public static double kdvTutar2(double tutar,double kdvOran2) {
		 return tutar = tutar * kdvOran2 ;
	 }
}
