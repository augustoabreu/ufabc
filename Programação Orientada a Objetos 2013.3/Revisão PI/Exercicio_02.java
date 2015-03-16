/**
 *	Exercício 2
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: imprime o quociente e o resto da divisão entre dois inteiros
 */

import java.util.Scanner;

public class Exercicio_02 {
	public static void main (String[] args) {
		int x, y;
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite um inteiro:");
		x = sc.nextInt();

		System.out.println("Digite outro inteiro:");
		y = sc.nextInt();

		System.out.println("Quociente da divisão de " + x + " por " + y + ": " + (x/y));
		System.out.println("Resto da divisão de " + x + " por " + y + ": " + (x%y));
	}
}