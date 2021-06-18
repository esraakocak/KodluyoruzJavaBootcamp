
//statik bir metodun içerisinde dışardan bir  metot çağırmak istiyorsak o metodunda statik olması gerekiyor.
//Metodun başında 'is' var ise geriye true yada false değer göndereceği anlamına gelir.
public class Palindrom {

	 static boolean isPalindrom(int number) {
		 
		 int temp = number,reserveNumber =0,lastNumber;
		 while(temp != 0) {
			 System.out.println("sayı =>  "+temp);
			 lastNumber=temp % 10;
			 System.out.println("son basamak => "+lastNumber);
			 reserveNumber =(reserveNumber*10)+lastNumber;
			 System.out.println("yeni sayı =>"+reserveNumber);
			 temp/=10;
		 }
		 
		  if(number == reserveNumber) {
			  System.out.println("palindrom");
			  return true;
		  }else {
			  System.out.println("palindrom değil");
			  return false;
		  }
		
		 
	 }
	public static void main(String[] args) {
	  isPalindrom(111);
	  System.out.println("*******");
	  isPalindrom(100);
	  

	}

}
