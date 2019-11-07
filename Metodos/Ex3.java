import java.util.*;

public class Metodo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a = MontaMenu();
		int x=0;
		while(x==0) {
		if(a==1) {
			System.out.println("Digite o número do fatorial");
			int nmr = ler.nextInt();
			int fat = Fatorial(nmr);
			System.out.println("O fatorial de "+nmr+" é "+ fat);
		}
		else if(a==2) {
			System.out.println("Digite o número a ser feito o fatorial");
		int	nmr = ler.nextInt();
			Tabuada(nmr);
		}
		
		else if(a==3) {
			System.out.println("Entre com o seu sexo");
			String nome = ler.next();
			System.out.println("Digite a idade");
			int idade = ler.nextInt();
			Ap(nome,idade);
		}
		else if(a==4) {
			
			System.out.println("Digite a base da potência");
			int base = ler.nextInt();
			System.out.println("Digite o expoente");
			int expo = ler.nextInt();
			
			Pot(base,expo);
		}
		else {
			break;
		}
		
		
		}
	}

	public static int MontaMenu() {
		int g = 0;
		int a = 0;
		while (g == 0) {
			Scanner ler = new Scanner(System.in);
			System.out.println(
					" Follow your dreams\n 1) Fatorial\n 2) Tabuada\n 3) Sexo e Idade\n 4) Potência\n 5) Don't follow your dream");

			a = ler.nextInt();
			if (a == 1) {
				return 1;
			} else if (a == 2) {
				return 2;
			}

			else if (a == 3) {
				return 3;
			} else if (a == 4) {
				return 4;
			} else if (a == 5) {
				break;
			} else {
				System.out.println("Digite um número válido");
				a = 6;
			}

			for (a = 6; a == 6;) {
				a = ler.nextInt();

				if (a == 1) {
					a = 1;
				} else if (a == 2) {
					a = 2;
				}

				else if (a == 3) {

					a = 3;
				} else if (a == 4) {
					a = 4;
				} else if (a == 5) {
					break;
				} else {
					System.out.println("Digite um número válido");
					a = 6;

				}

			}

		}
		return a;

	}

	public static int Fatorial(int x) {
		
	int soma = x;
	int total=0;
	for(int i = 1;i<x;i++) {
		soma += i * soma;
		 total = soma / x;
	}
	return total;
	}
	
	public static void Tabuada(int x) { 
		for(int i = 0; i<=10;i++) {
			
			System.out.println(x+" X "+i+" = "+(x*i));
			
			
		}
	}
	
	public static void Ap (String sexo, int idade) {
		int total = 0;
		if(sexo.equalsIgnoreCase("f")) {
			
			if(idade >=60) {
				System.out.println("Já está aposentada");
			}else {
				total = 60 - idade;
				System.out.println("Faltam "+total+" anos para você se aposentar");
			}
			
		}
		else if(sexo.equalsIgnoreCase("m")) {
			
		if(idade>= 65) {
			System.out.println("Já está aposentado");
		}else {
			System.out.println("Faltam "+(65-idade)+" para você se aposentar");
		}
			
			
		}
		
		
		
		
		
		
		
		
	}

	public static void Pot (int base, int expoente) {
		int i = 0, pot = 0;
		while(i<expoente) {
			pot = base * base;
			i++;
		}
		System.out.println(pot);
		
		
		
		
		
		
		
		
	}











}
