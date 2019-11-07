import java.util.Scanner;
public class Ex13 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int i, c;
		
		for (i=0; i<10;i++) {
			System.out.println("Digite o número da posição "+i+" do vetor A:");
			a[i] = leia.nextInt();
			
			if (a[i]%2==0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
		}
		
		System.out.println("Vetor B seguindo as regras: a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.");

		for (i=0; i<10;i++) {
			System.out.println("B = "+"["+b[i]+"]");
		}
		
	}
}