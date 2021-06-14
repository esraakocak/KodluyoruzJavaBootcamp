package Homework5;

import java.util.Scanner;

public class Homework5 {
	private static final double PI = 3.14;
	private static final int MAX_MERKEZ_ACI = 360;
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("yarıçap değerini giriniz");
		int yaricap = inp.nextInt();
		System.out.println("merkez açı değerini değerini giriniz");
		int merkezAci = inp.nextInt();
		
		double alan = alanHesapla(yaricap, merkezAci)
		System.out.println("daire diliminin alanı :"+alan);
	}
	
	public static double alanHesapla(double yaricap, int merkezAci) {
		return (
			PI * (yaricap * yaricap) * merkezAci
		) / MAX_MERKEZ_ACI;
	}
}
