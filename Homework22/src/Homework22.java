import java.util.Scanner;

public class Homework22 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        int bakiye = 1500;
       
       System.out.println("Bakiyeniz = " + bakiye);
       System.out.println("1-Para yat�rma\n" +
               "2-Para �ekme\n" +
               "3-Bakiye Sorgula\n" +
               "4-��k�� Yap");
       
       System.out.print("\n�sleminizi Seciniz: ");
       int islem = inp.nextInt();
       
       switch(islem) {
       case 1:
           System.out.println("Bakiyeniz = " + bakiye);
           System.out.print("�ekmek istedi�iniz tutar� giriniz: ");
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
           System.out.print("Yat�rmak istedi�iniz tutar� giriniz: ");
           tutar = inp.nextInt();
           bakiye += tutar;
           System.out.println("Yeni bakiyeniz = " + bakiye);
           break;
       case 3:
           System.out.println("Bakiyeniz = " + bakiye);
           break;
       case 4:
           System.out.println("Kart�n�z� almay� unutmay�n�z.!!");
           break;
       default:
           System.out.println("Yanl�s islem secitiniz. Tekrar giriniz.");
       } }
	            }
	        
	            
	        
	    

	


