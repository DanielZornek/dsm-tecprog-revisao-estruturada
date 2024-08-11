package br.org.fatecpg.tecprog.revisao.estruturada;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolhaExercicio;
		int numero = 0, numero2 = 0;
		int escolhaCalculo = 0;
		double lado = 0d, area = 0d;
		double PI = Math.PI;
		
		System.out.println("Qual exercício deseja ver?\n"
				+ "			0 - Sair\n"
				+ "			1 - Verifica Positivo ou Negativo\n"
				+ "			2 - Diferentes? Qual o maior?\n"
				+ "			3 - Qual área calcular?\n"
				+ "			4 - Tabuada\n"
				+ "			5 - Par ou Impar\n"
				+ "			6 - Calcular Fatorial\n"
				+ "			7 - Classificação faixa etária\n"
				+ "			8 - Soma dos Ímpares\n"
				+ "			9 - Lista de Nomes\n"
				+ "			10 - Verificação de senha\n");
		
		while(true) {
			
			System.out.print("\nEscolha: ");
			escolhaExercicio = entrada.nextInt();
			
			rodarAplicacao(escolhaExercicio, entrada, numero, numero2, escolhaCalculo, PI, lado, area);
			if(escolhaExercicio == 0) {
				Thread.sleep(1000);
				System.out.println("\nAté mais :).");
				break;
			}
		}
	}
	// Rodar Menu
	protected static void rodarAplicacao(int escolhaExercicio, Scanner entrada, int numero, int numero2, int escolhaCalculo, double PI, double lado, double area) {
		switch(escolhaExercicio){
			case 1:
				System.out.print("Informe um valor: ");
				numero = entrada.nextInt();
				System.out.println(verificaSePositivo(numero));
				break;
			case 2:
				System.out.print("Informe um valor: ");
				numero = entrada.nextInt();
				System.out.print("Informe um segundo valor: ");
				numero2 = entrada.nextInt();
				System.out.println(verificaIgualMaior(numero, numero2));
				break;
			case 3:
				System.out.println("1-Calcular area do quadrado\n2-Calcular area do circulo\n ");
				System.out.print("Escolha qual cálculo: ");
				escolhaCalculo = entrada.nextInt();
				switch(escolhaCalculo){
					case 1:
						System.out.println("Cálculo da área do quadrado\nInforme o lado: ");
						lado = entrada.nextDouble();
						area = lado * lado;
						System.out.println("A Aŕea desse quadrado é de: "+area+"^^2");
						break;
					case 2:
						System.out.println("Cálculo da área do Circulo\nInforme o raio: ");
						lado = entrada.nextDouble();
						area = 3.14 * (lado * lado);
						System.out.println("A Aŕea desse circulo é de: "+area+"^^2");
						break;
					default:
						System.out.println("Opção inválida, tente novamente.");
						break;
				}
			break;
			case 4:
				System.out.print("\nTabuada\nInforme o valor: ");
				numero = entrada.nextInt();
				mostrarTabuada(numero);
			break;
			case 5:
				System.out.print("\nInforme o valor: ");
				numero = entrada.nextInt();
				if(numero % 2 == 0) {
					System.out.println("Este valor é par");
				}else {
					System.out.println("Este valor é impar");
				}
			break;
			case 6:
				System.out.print("\nInforme o valor: ");
				numero = entrada.nextInt();
				calcularFatorial(numero);
			break;
			case 7:
				System.out.print("\nInforme sua idade: ");
				numero = entrada.nextInt();
				definirFaixaEtaria(numero);
			break;
			case 8:
				System.out.print("Digite um valor positivo inteiro: ");
				numero = entrada.nextInt();
				System.out.println(somarImpares(numero));
			break;
			case 9:
				System.out.println("Informe 5 nomes\n");
				buscarNome(inserirNomesLista(entrada), entrada);
			break;
				
		}
	}
	// 1
	protected static String verificaSePositivo(int numero) {
		if(numero < 0) {
			return "O número digitado é negativo";
		}else {
			return "O número digitado é positivo";
		}
	}
	// 2
	protected static String verificaIgualMaior(int numero, int numero2) {
		if(numero == numero2) {
			return numero+" é igual ao valor "+numero2;
		}else {
			System.out.println("Os valores são diferentes");	
			if(numero > numero2) {
				return "O primeiro valor " + numero + " é maior do que o segundo valor " + numero2;
			}else {
				return "O segundo valor " + numero2 + " é maior do que o primeiro valor " + numero;
			}
		}
	}
	// 4 
	protected static void mostrarTabuada(int numero) {
		for(int i = 0; i<=10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}
	// 6
	protected static void calcularFatorial(int numero) {
		long resultado = 1;
        for (int i = numero; i >= 1; i--) {
            resultado *= i;
            if(i == 1) {
            	System.out.print(i);
            }else {
            	System.out.print(i+" x ");
            }
        }
        System.out.println(" = "+resultado);
	}
	// 7 
	protected static void definirFaixaEtaria(int numero) {
		if(numero < 18) {
			if(numero < 18) {
				System.out.println("Parabéns por ter a proeza de ter a idade negativa");
			}else {
				System.out.println("Você é menor de idade"); 
			}
		}else if(numero >= 18 && numero < 60) {
			System.out.println("Você é um adulto");
		}else if(numero > 60) {
			if(numero > 120) {
				System.out.println("Ou você ta mentindo, ou é um vampiro");
			}else {
				System.out.println("Você é um idoso");
			}
		}
	}
	// 8
	protected static int somarImpares(int numero) {
		Integer somaImpares = 0, contador = 0;
		while(true) {
			if(contador % 2 != 0) {
				somaImpares += contador;
				numero--;
				if(numero == 0) {
					System.out.print(contador+" = ");
					break;
				}else {
					System.out.print(contador+" + ");
				}
			}
			contador++;
		}
		
		return somaImpares;
	}
	// 9
	protected static List<String> inserirNomesLista(Scanner entrada) {
		String nome;
		List<String> nomes = new ArrayList<>();
		
		entrada.nextLine();
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+"° nome: ");
			nome = entrada.nextLine();
			nomes.add(nome);
		}
		
		return nomes;
	}
	
	protected static void buscarNome(List<String> nomes, Scanner entrada) {
		String nomePesquisado;
		boolean encontrado = false;
		System.out.print("DIgite nome inserido: ");
		
		nomePesquisado = entrada.nextLine();
		
		for (String nome : nomes) {
			if(nomePesquisado.equals(nome)) {
				System.out.println("Nome encontrando, foi o " + (nomes.indexOf(nomePesquisado) + 1) + "° digitado.");
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("Nome não encontrado.");
		}
	}
}
