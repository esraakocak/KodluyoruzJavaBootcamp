package SwitchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int n1,n2,select;
		Scanner inp =new  Scanner(System.in);
		System.out.println("birinci sayýyý giriniz");
		n1=inp.nextInt();
		System.out.println("ikinci sayýyý giriniz");
		n2=inp.nextInt();
		
		System.out.println("1-toplama\n2-Çýkarma\n3-çarpma\n4-bölme");
		System.out.println("seçiniz");
		select=inp.nextInt();
		
	
		switch (select) {
		case 1: 
			System.out.println("toplama: "+(n1+n2));
			break;
		
		case 2: 
			System.out.println("çýkarma:" +(n1-n2));
			break;
		
		case 3: 
			System.out.println("çarpma:" +(n1*n2));
			break;

		case 4: 
			
			System.out.println("bölme:" +(n1/n2));
			break;
		
	default:
		System.out.println("yanlýþ girdiniz");
	

} }}
