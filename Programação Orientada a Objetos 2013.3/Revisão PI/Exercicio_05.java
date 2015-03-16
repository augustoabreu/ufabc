/**
 *	Exercício 5
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: verificar se palavra ocorre na frase
 */

import java.util.Scanner;

public class Exercicio_05 {
	public static void main (String[] args) {
		String frase, palavra;
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite uma frase:");
		frase = sc.next();

		System.out.println("Digite uma palavra:");
		palavra = sc.next();

		String test;
		int flen = frase.length(),
			plen = palavra.length(),
			cont = 0;
		for (int i = 0; i < flen; i++) {
			if ((i+plen) > flen) break;
			test = frase.substring(i, (i+plen));
			if (test.equals(palavra)) cont++;
		}
		System.out.println("A palavra " + palavra + " aparece " + cont + " vezes na frase.");
	}
}