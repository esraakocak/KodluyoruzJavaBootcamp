
public class Homework26 {

		for(int sayi=2 ; sayi <=100 ; sayi++) {
			
			int kontrol =0;
			for(int i=2; i<sayi; i++) {
				if(sayi % i==0) {
					kontrol=1;
				}
			} 
			if(kontrol == 0) {
				System.out.println(sayi+"\n");
			 
		}
	} }}

