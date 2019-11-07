import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int A[] = new int [10];
		int i, nmr;
		
		for (i=0;i<10;i++){
			System.out.println("Digite o número da posição "+i+" de A[]");
			A[i] = ler.nextInt();
			for(nmr=0;nmr<=A[i];nmr++){
				if(nmr%2==0){
					System.out.println(nmr);
				}
			}
			
		}
	}

}
