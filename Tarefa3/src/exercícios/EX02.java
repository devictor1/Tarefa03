/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */
package exercícios;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
				|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S")) {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Insira quantos eleitores residem na sua cidade: ");
				float eleitores = sc.nextInt();

				System.out.print("Insira quantos eleitores votaram branco na sua cidade: ");
				float votosBrancos = sc.nextInt();

				System.out.print("Insira quantos eleitores votaram nulo na sua cidade: ");
				float votosNulos = sc.nextInt();

				System.out.print("Insira a quantidade de votos válidos na sua cidade: ");
				float votosValidos = sc.nextInt();

				float resultadoBranco = (votosBrancos * 100 / eleitores);
				float resultadoNulo = (votosNulos * 100 / eleitores);
				float resultadoValidos = (votosValidos * 100 / eleitores);

				System.out.println("Obrigado! Segue abaixo a proporção dos votos!");
				System.out.println(resultadoBranco + "% dos votos foram Brancos!");
				System.out.println(resultadoNulo + "% dos votos foram Nulos!");
				System.out.println(resultadoValidos + "% dos votos foram Válidos!");

			} catch (Exception e) {
				System.out.println("Verifique novamente os dados inseridos! Algum deles está incorreto!");

			} finally {
			}
			Scanner sc = new Scanner(System.in);
			System.out.println(" ");
			System.out.println("Deseja repetir o processo?");

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
