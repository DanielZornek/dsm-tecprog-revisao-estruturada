package br.org.fatecpg.tecprog.revisao.estruturada;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolhaExercicio;
		
		System.out.println("Qual exercício deseja ver?\n"
				+ "			1 - Verifica Positivo ou Negativo\n"
				+ "			2 - Diferentes? Qual o maior?\n"
				+ "			3 - Qual área calcular?"
				+ "			4 - Tabuada\n"
				+ "			5 - Par ou Impar\n");
		
		escolhaExercicio = entrada.nextInt();
		
		switch(escolhaExercicio){
			case 1:
				System.out.print("Informe um valor: ");
				int numero = entrada.nextInt();
				System.out.println(verificaSePositivo(numero));
				break;
			case 2:
				
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
}
