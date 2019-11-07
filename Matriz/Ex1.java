import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, j = 0, nmr = 2;
		int m[][] = new int [4] [4];
		m[i][j] = 2;
		for(j=1 , i = 0; j<4; j++){
			
			m[i][j] = m[0][j-1]*2;
		
	}
		for(i = 1; i<4;j++){
			m[i][j] = m[1][0]*2;
		}
			
			for ( i = 0; i<4;i++ ){
					for(j = 0; j<4; j++){
						System.out.println(m[i][j]);
					}
			}
	}
}
