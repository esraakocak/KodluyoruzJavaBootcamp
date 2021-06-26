
public class MatrisTranspoz {

	public static void main(String[] args) {
		
		int original[][]={{8,12,4},{2,89,3},{36,24,15}};    
	    
	 
		int transpose[][]=new int[3][3];  
		    
	
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=original[j][i];  
		}    
		}    
		  
		System.out.println(" ");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println();   
		}    
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("matrisin transpozu:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();  
		}    
	

	}

}
