import java.util.Arrays;
import java.util.Scanner;

public class Homework34 {

	public static void main(String[] args) {
		  int[] list = {56, 34, 1, 8, 101, -2, -33};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Dizi : " + Arrays.toString(list));
	        System.out.print("Girilen Sayi : ");
	        int sayi = sc.nextInt();
	        int min = list[0];
	        int max = list[0];

	        for (int i : list) {
	            if (i < sayi &&  (sayi - i < 0 ? (sayi - i) * -1 : sayi -i ) < (sayi - min < 0 ? (sayi - min) * -1 : sayi -min )) {
	                min = i;
	            }
	            if (i > sayi &&  (sayi - i < 0 ? (sayi - i) * -1 : sayi -i ) < (sayi - min < 0 ? (sayi - min) * -1 : sayi -min )) {
	                max = i;
	            }
	        }

	        System.out.println("Girilen sayýdan küçük en yakýn sayý : " + min);
	        System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max);
	    }

	}


