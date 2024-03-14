/*
 *  Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura
 */
package exercícios;

import java.util.Random;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {

			try {

				Random random = new Random();
				int raio = random.nextInt(100) + 1;
				int altura = random.nextInt(100) + 1;
				double volume = (Math.PI * raio * raio * altura);

				System.out.print("O Volume da lata de óleo, considerando que o raio é igual a " + raio
						+ " m³ e a altura igual a " + altura + " m³, é de " + volume + " m³");

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
