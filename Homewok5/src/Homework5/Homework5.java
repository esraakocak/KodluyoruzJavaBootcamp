package Homework5;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		
		double pi =3.14;
		Scanner inp = new Scanner(System.in);
		System.out.println("yarýcap deðerini giriniz");
		int yaricap = inp.nextInt();
		System.out.println("merkez açý deðerini deðerini giriniz");
		int merkezAci= inp.nextInt();
		
		double alan =(pi*(yaricap*yaricap)*merkezAci)/360;
		System.out.println("daire diliminin alaný :"+alan);
		
		
		
	}
}
