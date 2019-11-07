import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int A[] = new int [10];
		int i, nmr;
		
		for (i=0;i<10;i++){
			System.out.println("Digite o número da posição "+i+" de A[]");
			A[i] = ler.nextInt();
			System.out.print(A[i]+" = ");
			for(nmr=1;nmr<=A[i];nmr++){
				if(A[i]%nmr==0){
					System.out.print(nmr+" ");
				}
			}
			
		
		}
	}

}
