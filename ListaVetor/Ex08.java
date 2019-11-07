import java.util.Scanner;
public class Ex08 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int i, c;
		
		for (i=0; i<10;i++) {
			System.out.println("Digite o número da posição "+i+" do vetor A:");
			a[i] = leia.nextInt();
		}
		
		for (i=0 , c = 1; i<10 && c <10 ;c++, i++) {
			b[0] = a[0] += a[c];
		}
		
		for (i=0 , c = 2; i<10 && c <10 ;c++, i++) {
			b[1] = a[1] += a[c];
		}
		
		for (i=0 , c = 3; i<10 && c <10 ;c++, i++) {
			b[2] = a[2] += a[c];
		}
		
		for (i=0 , c = 4; i<10 && c <10 ;c++, i++) {
			b[3] = a[3] += a[c];
		}
		
		for (i=0 , c = 5; i<10 && c <10 ;c++, i++) {
			b[4] = a[4] += a[c];
		}
		
		for (i=0 , c = 6; i<10 && c <10 ;c++, i++) {
			b[5] = a[5] += a[c];
		}
		
		for (i=0 , c = 7; i<10 && c <10 ;c++, i++) {
			b[6] = a[6] += a[c];
		}
		
		for (i=0 , c = 8; i<10 && c <10 ;c++, i++) {
			b[7] = a[7] += a[c];
		}
		
		for (i=0 , c = 9; i<10 && c <10 ;c++, i++) {
			b[8] = a[8] += a[c];
		}
		
		for (i=0 , c = 1; i<10 && c <10 ;c++, i++) {
			b[9] = a[9];
		}
		
		for (i=0; i<10;i++) {
			System.out.println(" ");
			System.out.println(" Vetor B na posição "+i);
			System.out.println("B ="+"["+b [i]+"]");
		}
		
	}
}
