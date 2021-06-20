import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	        System.out.println("N sayısını giriniz :");
	        double a = inp.nextInt();
	        double t = a;
	        double result = 0;
	        while (a > 0) {
	            result += (1 / a);
	            a--;
	        }

	        System.out.println(t + " Sayısının Harmonik Serisi= " + result);

	    }

	}


