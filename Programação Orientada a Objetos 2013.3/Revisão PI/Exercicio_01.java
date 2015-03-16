/**
 *	Exercício 1
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: Calcula dias, horas e minutos de um valor dado em segundos
 */

import java.util.Scanner;

public class Exercicio_01 {
	public static void main (String[] args) {
		double segundos, resto;
		Scanner sc = new Scanner (System.in);

		do {
			System.out.println("Quantos segundos devemos avaliar? (Digite -1 para sair)");
			segundos = sc.nextInt();

			if (segundos == -1) break;

			double dias = segundos/86400d;
			double hrs  = segundos/3600d;
			double mins = segundos/60d;

			System.out.println("-- " + segundos + " segundos equivalem a:");

			System.out.println("- " + dias + " dia(s)");
			System.out.println("- " + hrs + " hora(s)");
			System.out.println("- " + mins + " minutos(s)");
			System.out.println("-------------");
		} while (true);
	}
}