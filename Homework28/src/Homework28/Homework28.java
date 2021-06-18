package Homework28;

import java.util.Scanner;

public class Homework28 {
	
	
	static void mod() {
		  Scanner scan = new Scanner(System.in);
		  int number,number2,result=0;
		  System.out.println("ilk say�y� giriniz");
		  number=scan.nextInt();
		  System.out.println("hangi say�ya g�re mod al�n�cak");
		  number2=scan.nextInt();
		  result = number%number2;
		  System.out.println(+number+" "+" say�s�n�n"+" "+number2+"  say�s�na g�re modu "+result);
		  
	}
	
  static void rectangle() {
	  Scanner scan = new Scanner(System.in);
	  int longEdge,shortEdge,perimeter=0 ,area=0;
	  System.out.println("KISA KENAR UZUNLU�UNU G�R�N�Z ");
	  shortEdge=scan.nextInt();
	  System.out.println("UZUN KENAR UZUNLU�UNU G�R�N�Z ");
	  longEdge=scan.nextInt();
	  
	  perimeter = 2*(longEdge+shortEdge);
	  System.out.println("�evresi hesapland� :"+perimeter);
	  
	  area = longEdge*shortEdge;
	  System.out.println("alan� hesapland� :"+area);
	  
	  
	  
	  
  }

	  static void plus() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 0, i = 1;
	        while (true) {
	            System.out.print(i++ + ". say� :");
	            number = scan.nextInt();
	            if (number == 0) {
	                break;
	            }
	            result += number;
	        }
	        System.out.println("Sonu� : " + result);
	    }

	    static void minus() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Ka� adet say� gireceksiniz :");
	        int counter = scan.nextInt();
	        int number, result = 0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". say� :");
	            number = scan.nextInt();
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result -= number;
	        }

	        System.out.println("Sonu� : " + result);
	    }

	    static void times() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". say� :");
	            number = scan.nextInt();

	            if (number == 1)
	                break;

	            if (number == 0) {
	                result = 0;
	                break;
	            }
	            result *= number;
	        }

	        System.out.println("Sonu� : " + result);
	    }

	    static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Ka� adet say� gireceksiniz :");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". say� :");
	            number = scan.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("B�leni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("Sonu� : " + result);
	    }

	    static void power() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Taban de�eri giriniz :");
	        int base = scan.nextInt();
	        System.out.print("�s de�eri giriniz :");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("Sonu� : " + result);
	    }

	    static void factorial() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Say� giriniz :");
	        int n = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        System.out.println("Sonu� : " + result);
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int select;
	        String menu = "1- Toplama ��lemi\n"
	                + "2- ��karma ��lemi\n"
	                + "3- �arpma ��lemi\n"
	                + "4- B�lme i�lemi\n"
	                + "5- �sl� Say� Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
	                + "0- ��k�� Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("L�tfen bir i�lem se�iniz :");
	            select = scan.nextInt();
	            switch (select) {
	                case 1:
	                    plus();
	                    break;
	                case 2:
	                    minus();
	                    break;
	                case 3:
	                    times();
	                    break;
	                case 4:
	                    divided();
	                    break;
	                case 5:
	                    power();
	                    break;
	                case 6:
	                    factorial();
	                    break;
	                case 7:
	                    mod();
	                    break;    
	                case 8:
	                  rectangle();
	                    break;      
	                    
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);


	    }

}
