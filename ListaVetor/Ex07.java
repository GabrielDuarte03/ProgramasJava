import java.util.*;
class Ex07{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		double a[] = new double[15];
		double b[] = new double[15];
		int i=0,j;
		for(i = 0; i<15;i++){
			System.out.println("Entre com o valor da posicao "+(i+1));
			a[i] = entrada.nextInt();
			b[i] = a[i];
			j=1;
			while(j<a[i]){
				b[i] = (b[i] * j);
				j++;
			}
			
		}
		
		for(i = 0; i<15; i++){
			System.out.printf("O fatorial de %.0f é %.0f\n",a[i],b[i]);
			
		}
	}
}
