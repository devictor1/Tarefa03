/*
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5,
 * sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */
package exercícios;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
				|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S")) {

			try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor da temperatura em Celsius: ");
		float gCels = sc.nextFloat();
		float gFahr = ((gCels * 9 + 160) / 5);
		System.out.println("Este é o valor da temperatura em Fahrenheit: " + gFahr);
		
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