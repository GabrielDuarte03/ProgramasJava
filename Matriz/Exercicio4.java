import java.util.*;
public class Exercicio4{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int [4][4];
		vetor[] = new int [16];
		int a,chute,pontos=0;
		Random x = new Random();
		for(int i=0; i<matriz.length; i++){
			System.out.println("");
			for (int j=0;j<matriz[i].length;j++ ) {
				a=x.nextInt()%76;
				if(a<=0){
					a=a*(-1);
				}
				matriz[i][j] = a;
				System.out.print(matriz[i][j] +" ");
			}
		}
		System.out.println("");
		while(pontos<=15){
			System.out.println("Entre com número que você acredite ser está na coluna do bingo ");
			chute = leia.nextInt();
			for(int i=0; i<matriz.length; i++){
				for (int j=0;j<matriz[i].length;j++ ) {
					if(matriz[i][j] == chute){
						pontos++;
						System.out.println("Parabéns você acertou um número, só falta "+(16-pontos)+" números");
					}
				}
			}
		}
	}
}
