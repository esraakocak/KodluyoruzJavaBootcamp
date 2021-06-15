import java.util.Scanner;

public class Homework18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner inp=new Scanner(System.in);
	        System.out.println("N Deðerini Giriniz");
	        int n=inp.nextInt();
	        
	        System.out.println("R Deðerini Giriniz");
	        int r=inp.nextInt();
	        
	        if(n<r){
	            
	            System.out.println("N Sayýsý R Sayýsýndan Büyük Olmalýdýr. Lütfen Tekrar N Deðerini Giriniz.");
	            n=inp.nextInt();
	            KombinasyonHesapla(n,r);
	        }else{
	            KombinasyonHesapla(n,r);
	        }           
	}
	
	 private static void KombinasyonHesapla(int n, int r) {
	        // TODO Auto-generated method stub
	        
	        int faktoriyel_1=1;
	        int faktoriyel_2=1;
	        int faktoriyel_3=1;
	        int fark=n-r;
	        
	        for(int i=1;i<=n;i++){
	            
	            faktoriyel_1=faktoriyel_1*i;
	        }
	        System.out.println("N Sayýsýnýn Faktöriyeli : " + faktoriyel_1);
	        
	        for(int j=1;j<=r;j++){
	            
	            faktoriyel_2=faktoriyel_2*j;
	        }
	        System.out.println("R Sayýsýnýn Faktöriyeli : " + faktoriyel_2);
	        
	        for(int k=1;k<=fark;k++){
	            
	            faktoriyel_3=faktoriyel_3*k;
	        }
	        System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);
	        
	        int carpim=faktoriyel_2*faktoriyel_3;
	        int kombinasyon=faktoriyel_1/carpim;
	        
	        System.out.println(n + " Sayýsýnýn " + r + "'li" + " Kombinasyonu = " + kombinasyon);
	    }

	

}
