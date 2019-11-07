import java.util.*;
public class Ex02 {
	public static void main (String[]args){
		int matriz [] [] = new int [3] [3];
		Random a = new Random();
		
		for (int i = 0; i<matriz.length;i++){
			for (int j=0 ;j<matriz[i].length; j++){
				matriz [i][j] = a.nextInt(100);
			}
		}
		
		
		int maior = 0;
		int menor = 101;
		int colunaM=0;
		int linhaM=0;
		int colunam= 0;
		int linham = 0;
		for (int i = 0; i<matriz.length;i++){
			for (int j=0 ;j<matriz[i].length; j++){
				if (matriz [i][j]>maior){
					maior = matriz [i] [j];
					colunaM = j;
					linhaM = i;
				}
			}
		}
		
		for (int i = 0; i<matriz.length;i++){
			for (int j=0 ;j<matriz[i].length; j++){
				if (matriz [i][j]<menor){
					menor = matriz [i] [j];
					colunam = j;
					linham = i;
				}
			}
		}
		
		for (int i = 0; i<matriz.length;i++){
			for (int j=0 ;j<matriz[i].length; j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("O maior número é: "+maior+" se encontra na coluna "+(colunaM+1)+" e na linha "+(linhaM+1));
		System.out.println("O menor número é "+menor+" se encontra na coluna "+(colunam+1)+" e na linha "+(linham+1));
		
	}

}
