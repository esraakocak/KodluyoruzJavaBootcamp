package UserLogin;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String userName ,password;
		String passwordLogin ="1234";
		Scanner inp =new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýzý giriniz");
		userName =inp.nextLine();
		
		System.out.println("þifrenizi giriniz");
		password =inp.nextLine();
		
		if(userName.equals("esra") && password.equals(passwordLogin)) {
			System.out.println("baþarýlý");
			
		}else {
		
		
			System.out.println("kullanýcý adýný yanlýþ girdiniz.sýfýrlama ister misin?");
			System.out.println("1 evet , 2 hayýr");
			int select =inp.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("yeni þifrenizi girin:");
				String newPassword = inp.next();
				
				
				if(newPassword.equals(passwordLogin)  || newPassword.endsWith(password)) {
					System.out.println("yeni oluþturduðunuz þifre eski þifreniz ile ayný olamaz ");
				
				}else {
					System.out.println("yeni þifre oluþturuldu");
					password=newPassword; 
				}
				 break;
			case 2:
				System.out.println("þifre sýfýrlama iptqal edildi.");
			
			break;
			default:
				System.out.println("belirtilen deðer seçiniz");
		
			}
			
			
		}
		
		
		

	}
	
}
