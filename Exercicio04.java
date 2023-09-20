package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Arredondamento para Baixo: Crie um programa que solicita ao usuário um número
		 * decimal e use Math.floor(x) para arredondá-lo para o próximo número inteiro
		 * menor ou igual.
		 */

		Double numeroDoUsuario;

		while (true) {

			try {

				numeroDoUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite um número decimal"));

				if (numeroDoUsuario <= 0) {

					JOptionPane.showMessageDialog(null,
							" Erro! \n Você inseriu o número zero (0) ou um número negativo, ambos não são válidos");

				} else {
					Double arredondado = Math.floor(numeroDoUsuario);

					JOptionPane.showMessageDialog(null, "Número fornecido pelo usuario = " + numeroDoUsuario
							+ " \nNúmero arredondado = " + arredondado);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						" Ocorreu um erro inesperado! \n Você não digitou um número no campo!");

			}

		}

	}
}
