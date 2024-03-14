/*
 *  Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo,
 *  o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância 
 *  percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
 *  LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA)
 *  e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
 */
package exercícios;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {

		String resposta = "sim";

		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("sIm") || resposta.equals("siM")
				|| resposta.equals("SIm") || resposta.equals("sIM") || resposta.equals("SIM") || resposta.equals("SiM")
				|| resposta.equals("s") || resposta.equals("S")) {

			try {

				Scanner sc = new Scanner(System.in);

				System.out.println("Em quanto tempo foi feita a viagem? Responda em horas");
				float tempoDeViagem = sc.nextFloat();

				System.out.println("E qual foi a velocidade média por hora do veículo? Responda em quilometros");
				float velocidadeMedia = sc.nextFloat();

				float distancia = tempoDeViagem * velocidadeMedia;

				float litrosUsados = distancia / 12;

				System.out.println("De acordo com os dados fornecidos, sendo esses a velocidade média de " + velocidadeMedia
						+ " quilometros por hora, e o tempo gasto na viagem, de " + tempoDeViagem
						+ " horas, a distância percorrida foi de " + distancia
						+ " quilometros, e durante esse percurso foram utilizados " + litrosUsados
						+ " litros de combustível.");

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
