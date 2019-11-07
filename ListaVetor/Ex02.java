import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int A[] = new int[5];
		int i = 0, tb = 0, t=0;
		
		for (i = 0;i<5;i++){
			System.out.println("Digite um número para ver a tabuada do mesmo:");
			A[i] = ler.nextInt();
			System.out.println("A tabuada do numero "+A[i]+" é:");
			for(tb=0;tb<=10;tb++){
				t = A[i]*tb;
				System.out.println(A[i]+" X "+tb+" = "+t);
			}
		}
		System.out.println("\n FIM");
		
	}

}
