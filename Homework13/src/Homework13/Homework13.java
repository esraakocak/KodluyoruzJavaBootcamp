package Homework13;

import java.util.Scanner;

public class Homework13 {

	public static void main(String[] args) {
		 int birthYear ;
		 int month=12;
		 Scanner inp = new Scanner(System.in);
		 System.out.println("dogum y�l�n� gir");
		 birthYear=inp.nextInt();
		 
		 if(birthYear % month == 0) {
			 System.out.println("�in Zodya�� Burcunuz :maymun");
		 }else if(birthYear % month ==1 ) {
			 System.out.println("�in Zodya�� Burcunuz :horoz");
		 }else if(birthYear % month ==2) {
			 System.out.println("�in Zodya�� Burcunuz k�pek");
		 }
		 else if(birthYear % month ==3) {
			 System.out.println(" �in Zodya�� Burcunuz domuz");
		 }else if(birthYear % month ==4) {
			 System.out.println("�in Zodya�� Burcunuz fare");
		 }else if(birthYear % month ==5) {
			 System.out.println("�in Zodya�� Burcunuz �k�z");
		 }else if(birthYear % month ==6) {
			 System.out.println("�in Zodya�� Burcunuz kaplan");
		 }else if(birthYear % month ==7) {
			 System.out.println("�in Zodya�� Burcunuz tav�an");
		 }else if(birthYear % month ==8) {
			 System.out.println("�in Zodya�� Burcunuz ejdarha");
		 }else if(birthYear % month ==9) {
			 System.out.println("�in Zodya�� Burcunuz y�lan");
		 }else if(birthYear % month ==10) {
			 System.out.println("�in Zodya�� Burcunuz at");
		 }else if(birthYear % month ==11) {
			 System.out.println("�in Zodya�� Burcunuz koyun");
		 }
		 else {
			 System.out.println("ge�erli bir de�er gir");
		 }
		 

	}

}
