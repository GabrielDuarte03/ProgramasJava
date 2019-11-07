import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int A[] = new int [10];
	int cont=0;
	for(int i = 0; i<10;i++){
		System.out.println("Digite um número:");
		A[i] = ler.nextInt();
		if(A[i]==1){
			System.out.println("O número não é primo");
		}
		else if(A[i]==2){
			System.out.println("O número é primo");
		}else{
		for(int div = 1; div<=A[i]; div++){
			if(A[i]%div==0){
				cont++;
			}
			
		
			
		}
		if(cont>2){
			System.out.println("O número não é primo");
			cont=0;
		}else{
			System.out.println("O número é primo");
			cont=0;
		}
		
	}
		
		}
	System.out.println("\n FIM DO PROGRAMA");
			
						
			
			
	}

}
