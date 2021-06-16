import java.util.Scanner;

public class EbobEkok {

	

	   public static void main(String[] args) {
         int n1 = 48, n2 = 160,ebob=1, ekok;
 
       for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }
 
        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok); 
    } 
}



