import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		double kilo, boy , sonuc;
		System.out.println("L�tfen boyunuzu giriniz");
		Scanner inp = new Scanner(System.in);
		 boy = inp.nextDouble();
		
		System.out.println("L�tfen  kilonuzu giriniz");
		kilo =inp.nextDouble();
		
		sonuc = kilo/(boy*boy);
		System.out.println("v�cut kitle endeksiniz hesapland� :" +sonuc);
		


	}

}
