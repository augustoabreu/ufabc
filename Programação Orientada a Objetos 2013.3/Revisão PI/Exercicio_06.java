/**
 *	Exercício 6
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: jogo da forca de até 7 erros
 */

import java.util.Scanner;

public class Exercicio_06 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String palavra, letra;
		int plen, cont = 0;
		boolean controle = false;

		System.out.println("Digite uma palvra:");
		palavra = sc.next();
		plen = palavra.length();

		do {
			if (cont == plen) break;

			System.out.println("Digite uma letra:");
			letra = sc.next();
			
			if (letra.length() > 1) {
				System.out.println("\n---------\nDigite apenas uma letra por vez!\n---------");
				continue;
			}

			for (int i = 0; i < plen; i++) {
			}
		} while (controle == false);
	}
}