import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner  inp = new Scanner(System.in);
	         System.out.print(" ilk say�y� giriniz ");
	         int n1 = inp.nextInt();
	         System.out.print(" ikinci say�y� giriniz ");
	         int n2 = inp.nextInt(), ekok,ebob=1;
	 
	        ekok= (n1 > n2) ? n1 : n2;
	 
	        while(true)
	        {
	            if( ekok % n1 == 0 && ekok % n2 == 0 )
	            {
	                System.out.printf("%d ve %d say�lar�n�n EKOK'u %d \n", n1, n2, ekok);
	                break;
	            }
	            ++ekok;
	        }
	        
	        while(n1 != n2)
	        {
	            if(n1 > n2)
	                n1 -= n2;
	            else
	                n2 -= n1;
	        }
	 
	        System.out.println("EBOB'u = " + n1);
	    }

	}


