package Homework1;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		 int mat, fizik,kimya,turkce,tarih,muzik;
		 Scanner inp = new Scanner(System.in);
		 System.out.println("matematik notunu girin: ");
		 mat=inp.nextInt();
		 
		 System.out.println("fizik notunu girin: ");
		 fizik=inp.nextInt();
		 
		 System.out.println("kimya notunu girin: ");
		 kimya = inp.nextInt();
		 
		 System.out.println("turkce notunu girin: ");
		 turkce=inp.nextInt();
		 
		 System.out.println("tarih notunu girin: ");
		 tarih=inp.nextInt();
		 
		 System.out.println("muzik notunu girin: ");
		 muzik=inp.nextInt();
		 
		 int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
		 double sonuc=toplam/6.0;
		 System.out.println("notlarýn ortalamasý: "+sonuc);
		  if(sonuc >=60.0) {
			  System.out.println("Sýnýfý geçti");
		  }else {
			  System.out.println("sýnýfta kaldý");
		  }
		 

	}

}