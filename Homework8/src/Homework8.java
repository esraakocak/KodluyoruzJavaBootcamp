import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		int mat,fizik,turkce,muzik;
        int toplam =4;
		
		Scanner k=new Scanner(System.in);
	
		System.out.println("mat notunu giriniz :"); 
		mat=k.nextInt();
		System.out.println("fizik notunu giriniz :"); 
		fizik=k.nextInt();
		System.out.println("turkçe notunu giriniz :"); 
		turkce=k.nextInt();
		System.out.println("muzik notunu giriniz :"); 
		muzik=k.nextInt();
		if(mat>0 && mat <100 || fizik>0 && fizik<100 || turkce>0 && turkce<100 || muzik>0 && muzik<100) {
			System.out.println("ortalma hesaplanýyor");
			double ort =(mat+fizik+muzik+turkce)/toplam;
			
			   if(ort <= 55) {
				   System.out.println("sýnýfta kaldýnýz: "+ort);
			   }else {
				   System.out.println("sýnýfý geçtiniz ortalama: "+ort);
			   }
		}else {
			System.out.println("0 ile 100 arasýnda bir not girmediðiniz için hesaplama yapýlamadý. ");
		}
		
		
		}
		
	
		
		
	
		
	
	
	
	
	}


