/**
 *	Exercício 4
 *	Autor: Augusto Abreu
 *	Data: 2014-11-04
 *	Descrição: diz se um número é primo
 */

import java.util.Scanner;

public class Exercicio_04 {
	public static void main (String[] args) {
		int num, c;
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();

		c = num - 1;

        while( num % c != 0 ){
            c--;
        }

        if( c == 1 ){
            System.out.println( num + " é primo");  
        } else {
            System.out.println( num + " não é primo"); 
        }

	}
}