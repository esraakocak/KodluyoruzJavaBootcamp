package Homework4;

import java.util.Scanner;

public class Homework4 {
	
	public static void main(String[] args) {
		
		int km;
		double perKm = 2.20, total, startPrice=10.0;
		System.out.println("mesafeyi km cinsinden seçiniz");
		Scanner inp = new Scanner (System.in);
		km= inp.nextInt();
		
		total=(km*perKm);
		total += startPrice;
		if(total<=20) {
			total=20;
			System.out.println("toplam tutar"+total);
		}else {
			System.out.println("toplamtutar:"+total);
		}
		
		
		
		
		
		
	}

}
