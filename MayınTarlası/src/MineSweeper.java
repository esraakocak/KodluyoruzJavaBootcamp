import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	 Scanner sc = new Scanner(System.in);

	    public void basla() {
	    
	        System.out.print("Satýr Sayýsýný Giriniz : ");
	        int satir = sc.nextInt();
	        System.out.print("Sütun Sayýsýný Giriniz : ");
	        int sutun = sc.nextInt();
	        int mayinSayisi = (satir * sutun) / 4;
	        tarlaOlustur(satir, sutun, mayinSayisi);
	    }

	    public void tarlaOlustur(int satir, int sutun, int mayinSayisi) {
	        String[][] matrix = new String[satir][sutun];
	        int[] rndArr;
	        for (int i = 0; i < satir; i++) {
	            for (int j = 0; j < sutun; j++) {
	                matrix[i][j] = "-";
	            }
	        }
	        for (int i = 0; i < mayinSayisi; i++) {
	            do {
	                rndArr = mayin(satir, sutun);

	            } while (matrix[rndArr[0]][rndArr[1]].equals("*"));
	            matrix[rndArr[0]][rndArr[1]] = "*";
	        }

	        System.out.println("Mayýnlarýn Konumu");

	        for (int i = 0; i < satir; i++) {
	            for (int j = 0; j < sutun; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.print("\n");
	        }
	        cizgi();
	        oyna(matrix, satir, sutun);

	    }

	    public int[] mayin(int satir, int sutun) {
	        Random rnd = new Random();
	        int[] mayinKonum = {rnd.nextInt(satir), rnd.nextInt(sutun)};
	        return mayinKonum;
	    }

	    public void cizgi() {
	        System.out.println("==========================");
	    }

	    public void oyna(String[][] matrix, int satir, int sutun) {
	        System.out.println("Mayýn Tarlasý Oyununa Hoþ Geldiniz !");
	        String[][] gizliMatrix = new String[satir][sutun];
	        for (int i = 0; i < satir; i++) {
	            for (int j = 0; j < sutun; j++) {
	                gizliMatrix[i][j] = "-";
	            }
	        }
	        boolean status = true;
	        int count = 0;
	        int r, c, info = 0;
	        do {
	            for (int i = 0; i < satir; i++) {
	                for (int j = 0; j < sutun; j++) {
	                    System.out.print(gizliMatrix[i][j] + " ");
	                }
	                System.out.print("\n");
	            }
	            do {
	                System.out.print("Satýr Giriniz : ");
	                r = sc.nextInt();
	                System.out.print("Sutun Giriniz : ");
	                c = sc.nextInt();
	                if (r >= satir || c >= sutun) {
	                    System.out.println("Satýr veya sutun sayýsýndan buyuk sayý girmeyiniz. Lütfen Tekrar Deneyin. ");
	                }
	            } while (r >= satir || c >= sutun);

	            if (matrix[r][c].equals("*")) {
	                System.out.println("Game Over!!");
	                status = false;
	            } else {
	                info = 0;
	                if (r - 1 >= 0) {
	                    if (matrix[r - 1][c].equals("*")) {
	                        info++;
	                    }
	                }
	                if (r - 1 >= 0 && c - 1 >= 0) {
	                    if (matrix[r - 1][c - 1].equals("*")) {
	                        info++;
	                    }
	                }
	                if (c - 1 >= 0) {
	                    if (matrix[r][c - 1].equals("*")) {
	                        info++;
	                    }
	                }
	                if (c + 1 < sutun) {
	                    if (matrix[r][c + 1].equals("*")) {
	                        info++;
	                    }
	                }
	                if (c + 1 < sutun && r + 1 < satir) {
	                    if (matrix[r + 1][c + 1].equals("*")) {
	                        info++;
	                    }
	                }
	                if (r + 1 < satir) {
	                    if (matrix[r + 1][c].equals("*")) {
	                        info++;
	                    }
	                }
	                if (r - 1 >= 0 && c + 1 < sutun) {
	                    if (matrix[r - 1][c + 1].equals("*")) {
	                        info++;
	                    }
	                }
	                if (r + 1 < satir && c - 1 >= 0) {
	                    if (matrix[r + 1][c - 1].equals("*")) {
	                        info++;
	                    }
	                }
	                gizliMatrix[r][c] = String.valueOf(info);
	                count++;
	            }
	            cizgi();
	        } while (status && count < (satir * sutun) - ((satir * sutun) / 4));
	        if (status) {
	            System.out.println("Oyunu Kazandýnýz !");
	            for (int i = 0; i < satir; i++) {
	                for (int j = 0; j < sutun; j++) {
	                    if (gizliMatrix[i][j].equals("-")) {
	                        System.out.print("* ");
	                    } else {
	                        System.out.print(gizliMatrix[i][j] + " ");
	                    }
	                }
	                System.out.print("\n");
	            }
	        }
	    }
	}


