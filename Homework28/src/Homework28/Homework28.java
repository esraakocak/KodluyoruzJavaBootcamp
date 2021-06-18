package Homework28;

import java.util.Scanner;

public class Homework28 {
	
	
	static void mod() {
		  Scanner scan = new Scanner(System.in);
		  int number,number2,result=0;
		  System.out.println("ilk sayýyý giriniz");
		  number=scan.nextInt();
		  System.out.println("hangi sayýya göre mod alýnýcak");
		  number2=scan.nextInt();
		  result = number%number2;
		  System.out.println(+number+" "+" sayýsýnýn"+" "+number2+"  sayýsýna göre modu "+result);
		  
	}
	
  static void rectangle() {
	  Scanner scan = new Scanner(System.in);
	  int longEdge,shortEdge,perimeter=0 ,area=0;
	  System.out.println("KISA KENAR UZUNLUÐUNU GÝRÝNÝZ ");
	  shortEdge=scan.nextInt();
	  System.out.println("UZUN KENAR UZUNLUÐUNU GÝRÝNÝZ ");
	  longEdge=scan.nextInt();
	  
	  perimeter = 2*(longEdge+shortEdge);
	  System.out.println("çevresi hesaplandý :"+perimeter);
	  
	  area = longEdge*shortEdge;
	  System.out.println("alaný hesaplandý :"+area);
	  
	  
	  
	  
  }

	  static void plus() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 0, i = 1;
	        while (true) {
	            System.out.print(i++ + ". sayý :");
	            number = scan.nextInt();
	            if (number == 0) {
	                break;
	            }
	            result += number;
	        }
	        System.out.println("Sonuç : " + result);
	    }

	    static void minus() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int counter = scan.nextInt();
	        int number, result = 0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayý :");
	            number = scan.nextInt();
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result -= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void times() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". sayý :");
	            number = scan.nextInt();

	            if (number == 1)
	                break;

	            if (number == 0) {
	                result = 0;
	                break;
	            }
	            result *= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayý :");
	            number = scan.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("Böleni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void power() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Taban deðeri giriniz :");
	        int base = scan.nextInt();
	        System.out.print("Üs deðeri giriniz :");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void factorial() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Sayý giriniz :");
	        int n = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        System.out.println("Sonuç : " + result);
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int select;
	        String menu = "1- Toplama Ýþlemi\n"
	                + "2- Çýkarma Ýþlemi\n"
	                + "3- Çarpma Ýþlemi\n"
	                + "4- Bölme iþlemi\n"
	                + "5- Üslü Sayý Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
	                + "0- Çýkýþ Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("Lütfen bir iþlem seçiniz :");
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
	                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);


	    }

}
