package Homework2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		double tutar,kdvOran=0.18, kdvOran2=0.08;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("�cret tutar�n� giriniz");
		tutar =inp.nextDouble();
	if(tutar==0 || tutar <1000) {
		System.out.println("girilen  tutar 0 ve 1000 TL aras�nda  ");
	
		double kdvTutar = tutar * kdvOran;
		System.out.println("KDV oran� %18 "+kdvTutar);
		
	}else {
		System.out.println("girilen tutar 1000 TL den b�y�k");
	
		double kdvTutar = tutar * kdvOran2;
		System.out.println("KDV oran� %8 "+kdvTutar);
	}
	 
} }
