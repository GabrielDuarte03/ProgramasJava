import java.util.Scanner;
public class Ex11 {
	public static void main (String[]args) {
		Scanner leia = new Scanner(System.in);
		int a [] = new int [10];
		int i, pesquisa, aux=0;	
		
		
		for (i=0; i<10;i++) {
			System.out.println("Digite o n�mero da posi��o "+i+" do vetor A:");
			a[i] = leia.nextInt();
		}
		System.out.println(" ");
		System.out.println("Digite o n�mero que deseja pesquisar em A:");
		pesquisa = leia.nextInt();
		
		
		for (i=0; i<10;i++) {
			
			if (a[i] == pesquisa) {
				aux = pesquisa;
			}
			else {

			}
		}
		
		if (aux==pesquisa) {
		System.out.println("O n�mero "+pesquisa+" existe no vetor A.");
		}
		else {
		System.out.println("O n�mero "+pesquisa+" n�o existe no vetor A.");
		}
	}
}
