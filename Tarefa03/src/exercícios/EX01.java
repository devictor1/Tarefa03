/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
 * Considerar ano com 365 dias e mês com 30 dias.
 */
package exercícios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		String resposta = "sim";
		
		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM")
				|| resposta.equals("SiM") || resposta.equals("s") || resposta.equals("S")) {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Insira, em números, quantos anos você tem, quantos meses se passaram desde o seu último aniversário, e qual o dia de hoje: ");
				short ano = sc.nextShort();
				byte mes = sc.nextByte();
				byte dia = sc.nextByte();
				int anodia = (ano * 365);
				int mesdia = (mes * 30);

				int resultado = (anodia + mesdia + dia);

				System.out.println("Sua idade em dias é: " + resultado);

				
			} catch (Exception e) {
				System.out.println("Me desculpe mas apenas números são aceitos!");

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
