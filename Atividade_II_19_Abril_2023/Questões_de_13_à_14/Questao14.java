package Questão14;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 1, soma = 0;
		System.out.println("Hello Worlds");
		do {
			System.out.println("Digite um numero");
			num1 = sc.nextInt();
			soma = num1 + soma;
		} while(num1 != 0);
		System.out.println("A soma dos números digitados = "+ soma);
		sc.close();
	}
}


