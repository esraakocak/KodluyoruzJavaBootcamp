import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	        System.out.println("N say�s�n� giriniz :");
	        double a = inp.nextInt();
	        double t = a;
	        double result = 0;
	        while (a > 0) {
	            result += (1 / a);
	            a--;
	        }

	        System.out.println(t + " Say�s�n�n Harmonik Serisi= " + result);

	    }

	}


