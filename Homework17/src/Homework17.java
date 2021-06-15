import java.util.Scanner;

public class Homework17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner inp = new Scanner(System.in);
	        System.out.println("Sayi gir: ");
	        int sayi = inp.nextInt();
	        for(int i=1;i<=sayi;i++){
	            System.out.print("4'üncü katý :"+Math.pow(i, 4));
	            System.out.print("\t5'inci katý : "+Math.pow(i, 5));
	            System.out.println("");
	        }

	}

}
