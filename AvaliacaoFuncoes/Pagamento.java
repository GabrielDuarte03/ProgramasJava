import java.util.*;

public class Pagamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor gasto: ");
		double gasto = ler.nextDouble();
		int menu = MontaMenu(gasto);
		if (menu == 1) {
			System.out.printf("Você irá pagar R$ %.2f\n", AVista(gasto));
		} else if (menu == 2) {
			System.out.printf("Você irá pagar duas parcelas de R$ %.2f\n", Parc(gasto));
		} else {
			System.out.println("Em quantos meses você deseja pagar?");
			int mes = ler.nextInt();
			while (mes > 10) {
				System.out.println("Só até 10x, digite a quantidade de parcelas válidas");
				mes = ler.nextInt();
			}
			System.out.printf("Você irá pagar durante meses, o valor de R$ %.2f\n", ParcG(gasto, mes));

		}

	}

	public static double ParcG(double gasto, int mes) {

		int i = 0;
		double total = 0;
		total = gasto;
		for (i = 1; i <= mes; i++) {

			total += (total * 0.03);

		}

		return total / mes;

	}

	public static double Parc(double gasto) {

		double total = gasto / 2;

		return total;
	}

	public static double AVista(double gasto) {

		double total = gasto - (gasto * 0.1);

		return total;
	}

	public static int MontaMenu(double gasto) {
		int g = 0;
		int a = 0;
		while (g == 0) {
			Scanner ler = new Scanner(System.in);

			if (gasto > 100) {
				System.out.println(
						"\nEscolha a forma de pagamento\n\n 1) A vista com 10% de desconto\n 2) Em duas vezes\n 3) De 3 até 10 vezes com 3% de juros (apenas compras acima de R$ 100,00)");

				a = ler.nextInt();
				if (a == 1) {
					return 1;
				} else if (a == 2) {
					return 2;
				}

				else if (a == 3) {
					return 3;
				} else {
					System.out.println("Digite um número válido");
					a = 6;
				}

				for (a = 6; a == 6;) {
					a = ler.nextInt();

					if (a == 1) {
						return 1;
					} else if (a == 2) {
						return 2;
					}

					else if (a == 3) {

						return 3;

					} else {
						System.out.println("Digite uma opção válida");
						a = 6;

					}

				}

			} else {

				System.out.println(
						"Escolha a forma de pagamento\n\n 1) A vista com 10% de desconto\n 2) Em duas vezes\n");

				a = ler.nextInt();
				if (a == 1) {
					return 1;
				} else if (a == 2) {
					return 2;
				}

				else {
					System.out.println("Digite um número válido");
					a = 6;
				}

				for (a = 6; a == 6;) {
					a = ler.nextInt();

					if (a == 1) {
						return 1;
					} else if (a == 2) {
						return 2;

					} else {
						System.out.println("Digite uma opção válida");
						a = 6;

					}

				}

			}

		}
		return a;

	}
}
