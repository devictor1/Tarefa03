/*
 *   Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a 
 *   variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os 
 *   valores trocados.
 */
package exercícios;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {

			try {
				Scanner sc = new Scanner(System.in);
				
				String variavelTemporaria;
				
				System.out.println("Insira o valor da variável A!");
				String a = sc.next();
				
				System.out.println("Agora insira o valor da variável B!");
				String b = sc.next();
				
				variavelTemporaria = a;
				a = b;
				b = variavelTemporaria;
				
				System.out.println("Agora elas inverteram! A variável A agora é " + a + ", e a variável B agora é " + b);
				

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
