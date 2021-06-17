package Fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		  int[] fibo = new int [9];

		  fibo[0] = 1;
		  fibo[1] = 1;
		  for ( int i = 0; i < 7; i++ ){
		  fibo[i+2] = fibo[i] + fibo[i+1]; }
		    for (int i = 0; i < 15; i++ ) {

		  System.out.println( (i+1) + ".eleman ->  " + fibo[i] );

		  }}}