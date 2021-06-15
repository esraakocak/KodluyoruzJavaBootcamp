import java.util.Scanner;

public class Homework24 {

	public static void main(String[] args) {
		
		   Scanner inp = new Scanner(System.in);
	         int sum = 0;
	        
	        System.out.print("Bir sayi giriniz: ");
	        int number = inp.nextInt(); 
	        for(int i = 1; i < number; i++) {
	            if(number % i == 0) {
	                sum += i;
	            }
	        }
	        if(number == sum) {
	            System.out.println(number + " Mükemmel bir sayidir");
	        }
	        else {
	            System.out.println(number + " Mükemmel bir sayi degildir.");
	        }
	    }
		

}
