package Homework14;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		int year;
		int value =4;
		Scanner inp = new Scanner(System.in);
		System.out.print("do�um y�l�n�z� girin :");
		year = inp.nextInt();
		
		if(year % value ==0) {
			System.out.println(year+" "+"art�k y�ld�r");
		}else {
			System.out.println(year+" "+"art�k y�l de�ildir ");
			
		}

	}

}
