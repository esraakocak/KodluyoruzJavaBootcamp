
//statik bir metodun i�erisinde d��ardan bir  metot �a��rmak istiyorsak o metodunda statik olmas� gerekiyor.
//Metodun ba��nda 'is' var ise geriye true yada false de�er g�nderece�i anlam�na gelir.
public class Palindrom {

	 static boolean isPalindrom(int number) {
		 
		 int temp = number,reserveNumber =0,lastNumber;
		 while(temp != 0) {
			 System.out.println("say� =>  "+temp);
			 lastNumber=temp % 10;
			 System.out.println("son basamak => "+lastNumber);
			 reserveNumber =(reserveNumber*10)+lastNumber;
			 System.out.println("yeni say� =>"+reserveNumber);
			 temp/=10;
		 }
		 
		  if(number == reserveNumber) {
			  System.out.println("palindrom");
			  return true;
		  }else {
			  System.out.println("palindrom de�il");
			  return false;
		  }
		
		 
	 }
	public static void main(String[] args) {
	  isPalindrom(111);
	  System.out.println("*******");
	  isPalindrom(100);
	  

	}

}
