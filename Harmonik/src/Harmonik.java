import java.util.Scanner;

public class Harmonik {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.println("N sayısını giriniz :");
	        double n = input.nextInt();
	        double result = 0;
	        while (n > 0) {
	            result += (1 / n);
	            n--;
	        }

	        System.out.println(result);
	    }
	

}
