import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int A[] = new int [20];
		int B[] = new int [20];
		int imp = 0, i = 0, j = 19, k = 0;
		while(i<20 && j>=0) {
			System.out.println("Digite a posição "+i+" de A[]");
			A[i] = ler.nextInt();
			if((A[i]%2)==0) {
				B[k] = A[i];
				
				
				k++;
				
			}else {
				B[j] = A[i];
				j--;
			}
			
			
			
			i++;
			
			
		}
		System.out.println("O Vetor final B[] sera: ");
		for(i = 0; i<19;i++) {
			
			System.out.println("B["+i+"] = "+B[i]);
		}
	
	
	
	
	}

}
