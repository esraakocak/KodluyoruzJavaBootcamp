import java.util.Scanner;

public class Homework39 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Sayý Giriniz: ");
	        int sayi = sc.nextInt();
	        int tmp = sayi;
	        metotDeseni(sayi,tmp,false);

	}
	
	
	   public static void metotDeseni(int sayi, int tmp, boolean status) {

	        if (sayi <= tmp) {
	            System.out.print(sayi);
	            if (sayi > 0 && !status) {
	                metotDeseni(sayi-5,tmp,false);
	            }else{
	                metotDeseni(sayi+5,tmp,true);
	            }
	        }
	    }

}
