package Homework29;

import java.util.Scanner;

public class Homework29 {


    static int exponentiation(int x, int y) {
	if(y>1) {
		x = x*exponentiation(x,y-1);
	}
        return x;
}
	public static void main(String[] args) {
	 Scanner inp = new Scanner(System.in);
	 int base,power;
	 System.out.print("taban deðerini giriniz   :");
	 base=inp.nextInt();
	 System.out.print("üs deðerini giriniz  :");
	 power=inp.nextInt();
	 System.out.println(exponentiation(base, power));
	

	}

}
