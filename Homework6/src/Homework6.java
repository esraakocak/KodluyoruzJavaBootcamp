import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		double kilo, boy , sonuc;
		System.out.println("Lütfen boyunuzu giriniz");
		Scanner inp = new Scanner(System.in);
		 boy = inp.nextDouble();
		
		System.out.println("Lütfen  kilonuzu giriniz");
		kilo =inp.nextDouble();
		
		sonuc = kilo/(boy*boy);
		System.out.println("vücut kitle endeksiniz hesaplandý :" +sonuc);
		


	}

}
