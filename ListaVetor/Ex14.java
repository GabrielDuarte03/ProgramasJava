import java.util.Scanner;
public class Ex14 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int c [] = new int [10];
		int i, j;
		
		for (i=0; i<10;i++) {
			System.out.println("Digite o número da posição "+i+" do vetor A:");
			a[i] = leia.nextInt();
			System.out.println("Digite o número da posição "+i+" do vetor B:");

			b[i] = leia.nextInt();
			
			if (a[i] > b[i]) {
				c[i] = 1;
			}
			else if (a[i] == b[i]) {
				c[i] = 0;
			}
			else {
				c [i] = -1;
			}
			
		}
		
		
		
		System.out.println("Vetor C seguindo as regras: a) Ci deverá receber 1quando Ai for maior que Bi; b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi.");

		for (i=0; i<10;i++) {
			System.out.println("B = "+"["+c[i]+"]");
		}
		
	}
}