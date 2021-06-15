package Homework14;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		int year;
		int value =4;
		Scanner inp = new Scanner(System.in);
		System.out.print("doðum yýlýnýzý girin :");
		year = inp.nextInt();
		
		if(year % value ==0) {
			System.out.println(year+" "+"artýk yýldýr");
		}else {
			System.out.println(year+" "+"artýk yýl deðildir ");
			
		}

	}

}
