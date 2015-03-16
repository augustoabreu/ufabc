/**
 *	Exercício 3
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: imprime o quociente e o resto da divisão entre dois inteiros
 */

import java.util.Scanner;

public class Exercicio_03 {
	public static void main (String[] args) {
		double nota, media = 0, n6 = 0, n8 = 0, n4 = 0, max = 0, min = 10;
		int c = 5;
		Scanner sc = new Scanner (System.in);

		do {
			System.out.println("Digite a nota do aluno:");
			nota = sc.nextDouble();
			media += nota;
			if (nota >= 8.0) n8++;
			if (nota >= 6.0) n6++;
			if (nota < 4.0) n4++;
			if (nota > max) max = nota;
			if (nota < min) min = nota;
			c--;
		} while(c != 0);
		media = media / 5;

		System.out.println("---------")

		System.out.println("Média: " + media);
		System.out.println("Maior nota: " + max);
		System.out.println("Menor nota: " + min);
		System.out.println("Alunos com nota maior que 8: " + n8);
		System.out.println("Alunos com nota maior que 6: " + n6);
		System.out.println("Alunos com nota menor que 4: " + n4);
	}
}