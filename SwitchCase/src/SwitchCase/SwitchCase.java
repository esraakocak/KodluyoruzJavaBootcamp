package SwitchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int n1,n2,select;
		Scanner inp =new  Scanner(System.in);
		System.out.println("birinci say�y� giriniz");
		n1=inp.nextInt();
		System.out.println("ikinci say�y� giriniz");
		n2=inp.nextInt();
		
		System.out.println("1-toplama\n2-��karma\n3-�arpma\n4-b�lme");
		System.out.println("se�iniz");
		select=inp.nextInt();
		
	
		switch (select) {
		case 1: 
			System.out.println("toplama: "+(n1+n2));
			break;
		
		case 2: 
			System.out.println("��karma:" +(n1-n2));
			break;
		
		case 3: 
			System.out.println("�arpma:" +(n1*n2));
			break;

		case 4: 
			
			System.out.println("b�lme:" +(n1/n2));
			break;
		
	default:
		System.out.println("yanl�� girdiniz");
	

} }}
