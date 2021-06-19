import java.util.Scanner;

public class Asal {

	
    static boolean isAsal(int n, int i) {

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
      
     
        return isAsal(n, i + 1);
    }
	public static void main(String[] args) {
		  Scanner inp= new Scanner(System.in);
	         System.out.print("Sayiyi Giriniz : "); 
	         int a = inp.nextInt();
	         if(isAsal(a, 2))
	             System.out.println("Sayi asal");
	         else
	             System.out.println("Sayi asal degil");
	    }

	}


