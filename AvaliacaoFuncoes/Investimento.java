import java.util.*;

public class Investimento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor que deseja investir");
		double valor = ler.nextDouble();
		System.out.println("Digite a quantidade de meses ");
		int mes = ler.nextInt();
		System.out.printf("Você terá depois desses meses R$ %.2f\n", Juros(valor, mes));

	}

	public static double Juros(double valor, int mes) {

		int i = 0;
		double total = 0;
		total = valor;
		for (i = 1; i <= mes; i++) {

			total += (total * 0.01);

		}
		return total;

	}

}
