/*
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 * Calcular e escrever o valor do novo salário.
 */
package exercícios;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
				|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S")) {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Insira o seu salário mensal atual, apenas em números: ");
		
				float salario = sc.nextFloat();
				
				System.out.println("Agora, insira o percentual de reajuste salarial, apenas em números: ");
				
				float reajuste = sc.nextFloat();
				
				float resultado = ((reajuste / 100 + 1) * salario);

				System.out.println("O seu salário após o reajuste será de: " + resultado + " reais!");
				
			} catch (Exception e) {
				System.out.println("Verifique novamente os dados inseridos! Algum deles está incorreto!");

			} finally {
			}
			Scanner sc = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("Deseja repetir o processo? Sim / Não");

			resposta = sc.next();

			if (!(resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
					|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
					|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S"))) {
				System.out.println("Obrigado por utilizar nossos serviços!");
				sc.close();
			}

		}
	}
}