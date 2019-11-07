import java.util.Scanner;
public class Ex09 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int c [] = new int [10];
		int i, d, j;
		
		for (i=0; i<10;i++) {
			System.out.println("Digite a o número da posição "+i+" de A");
			a[i] = leia.nextInt();
			System.out.println("Digite a o número da posição "+i+" de B");

			b[i] = leia.nextInt();
			
			if (a[i] == b[i]) {
				c [i] = a [i];
			}
			else {
				
			}
		}
	
		for (j=0; j<10;j++) {
			
			if (c[j]!=0) {
			System.out.println("Os elementos que existem em A e também existem em B são: "+c[j]);
			}
			else {
				
			}
		}
		
		

		
	}
}
