import java.util.Scanner;

public class Homework23 {

	public static void main(String[] args) {
	    
		
	
		System.out.print("dizinin eleman sayisini giriniz:");
		Scanner inp=new Scanner(System.in);
		int enkck,enbyk;
		int sayi=inp.nextInt();
		int dizi[]=new int[sayi];
		for (int i = 0; i <sayi; i++)       {

		System.out.println("dizinin"+i+" giriniz ? = ");
		dizi[i]=inp.nextInt();
		enbyk=enkck=dizi[0];
		System.out.println("");
		for (int j = 0; j <sayi; j++)

		{

		if(dizi[i]<enkck)
		{
		enkck=dizi[i];
		}
		if(dizi[i]>enbyk)
		{
		enbyk=dizi[i];
		}
		
		}
		System.out.println("dizinin en kck elemani : " +enkck);
		System.out.println("dizinin en byk elmani: "+ enbyk);
        
		                        }

	}

}
