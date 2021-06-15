package Homework13;

import java.util.Scanner;

public class Homework13 {

	public static void main(String[] args) {
		 int birthYear ;
		 int month=12;
		 Scanner inp = new Scanner(System.in);
		 System.out.println("dogum yýlýný gir");
		 birthYear=inp.nextInt();
		 
		 if(birthYear % month == 0) {
			 System.out.println("Çin Zodyaðý Burcunuz :maymun");
		 }else if(birthYear % month ==1 ) {
			 System.out.println("Çin Zodyaðý Burcunuz :horoz");
		 }else if(birthYear % month ==2) {
			 System.out.println("Çin Zodyaðý Burcunuz köpek");
		 }
		 else if(birthYear % month ==3) {
			 System.out.println(" Çin Zodyaðý Burcunuz domuz");
		 }else if(birthYear % month ==4) {
			 System.out.println("Çin Zodyaðý Burcunuz fare");
		 }else if(birthYear % month ==5) {
			 System.out.println("Çin Zodyaðý Burcunuz öküz");
		 }else if(birthYear % month ==6) {
			 System.out.println("Çin Zodyaðý Burcunuz kaplan");
		 }else if(birthYear % month ==7) {
			 System.out.println("Çin Zodyaðý Burcunuz tavþan");
		 }else if(birthYear % month ==8) {
			 System.out.println("Çin Zodyaðý Burcunuz ejdarha");
		 }else if(birthYear % month ==9) {
			 System.out.println("Çin Zodyaðý Burcunuz yýlan");
		 }else if(birthYear % month ==10) {
			 System.out.println("Çin Zodyaðý Burcunuz at");
		 }else if(birthYear % month ==11) {
			 System.out.println("Çin Zodyaðý Burcunuz koyun");
		 }
		 else {
			 System.out.println("geçerli bir deðer gir");
		 }
		 

	}

}
