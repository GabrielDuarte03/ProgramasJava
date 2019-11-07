import java.util.Scanner;
public class Ex12 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10];
		int i, up, down, aux=2;
		
		for (i=0; i<10;i++) {
			System.out.println("Digite o número da posição "+i+" do vetor A:");

			a[i] = leia.nextInt();
		}
		
		for (i=0, up = 0, down = 9 ; i<10 && up<5 && down>5;i++, down--, up++) {
			
			if (a[up]==a[down]) {
				aux = 1;
			}
			else {
				aux = 0;
			}
		}
		
		if (aux==1) {
			System.out.println("O vetor é composto de um número palíndromo");
		}
		else {
			System.out.println("O vetor não é composto de um número palíndromo");

		}
		
	}
}
