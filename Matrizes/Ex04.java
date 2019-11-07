import java.util.*;
public class Ex03 {
	public static void main (String[] args){
		
		int m [][] = new int [3][4];
		int i = 0, j = 0;
		int soma = 0;
		Random a = new Random (100);
		
		for(i=0;i<m.length;i++){
			
			
			for(j = 0; j<m[i].length;j++){
				if(j<3){
					
				
			
				m[i][j] = a.nextInt();
				soma+=m[i][j];
				}
				else{
					m[i][j] = soma;
				}
				
				
			}
			
		for(i=0;i<m.length;i++){
			for(j = 0;j<m.length;j++){
				System.out.print(m[i][j]+" ");
			}
			
			System.out.println();
		}
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
