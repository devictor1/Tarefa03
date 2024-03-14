/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */
package exercícios;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
				|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S")) {

			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("Qual o custo de fábrica do carro escolhido? Favor inserir apenas números.");
				float custoFabrica = sc.nextFloat();
				
				double porcentoDistribuidor = (custoFabrica * 1.28);
				double porcentoImpostos = (custoFabrica * 1.45);
				double resultado = (porcentoDistribuidor + porcentoImpostos - custoFabrica);
				
				System.out.println("O custo final para o consumidor será de " + resultado + " reais!");
				
				
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