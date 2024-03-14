/*
 *  Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula 
 *  PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO)
 */
package exercícios;

import java.util.Random;
import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {

			try {

				Random random = new Random();
				float valor = random.nextFloat(10000) + 1;
				float taxa = random.nextFloat(101);
				int tempo = random.nextInt(100) + 1;
				float prestacao = (valor + (valor * taxa / 100) * tempo);
				System.out.println("Considerando o valor inicial da fatura sendo " + valor
						+ " reais, a taxa mensal sendo " + taxa + "% e o tempo que já passou, " + tempo + " meses, ");
				System.out.println("podemos concluir que o valor atual da prestação é de " + prestacao+ " reais.");

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
