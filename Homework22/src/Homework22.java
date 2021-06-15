import java.util.Scanner;

public class Homework22 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        int bakiye = 1500;
       
       System.out.println("Bakiyeniz = " + bakiye);
       System.out.println("1-Para yatırma\n" +
               "2-Para Çekme\n" +
               "3-Bakiye Sorgula\n" +
               "4-Çıkış Yap");
       
       System.out.print("\nİsleminizi Seciniz: ");
       int islem = inp.nextInt();
       
       switch(islem) {
       case 1:
           System.out.println("Bakiyeniz = " + bakiye);
           System.out.print("Çekmek istediğiniz tutarı giriniz: ");
           int tutar = inp.nextInt();
           if(tutar > bakiye) {
               System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
               tutar = inp.nextInt();
           }
           bakiye -= tutar;
           System.out.println("Yeni bakiyeniz = " + bakiye);
           break;
       case 2:
           System.out.println("Bakiyeniz = " + bakiye);
           System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
           tutar = inp.nextInt();
           bakiye += tutar;
           System.out.println("Yeni bakiyeniz = " + bakiye);
           break;
       case 3:
           System.out.println("Bakiyeniz = " + bakiye);
           break;
       case 4:
           System.out.println("Kartınızı almayı unutmayınız.!!");
           break;
       default:
           System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
       } }
	            }
	        
	            
	        
	    

	


