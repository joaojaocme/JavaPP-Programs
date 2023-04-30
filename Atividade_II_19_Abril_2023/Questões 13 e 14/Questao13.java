package Questão13;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		System.out.println("Hello Worlds");
		do {
			System.out.println("Digite um numero");
			num1 = sc.nextInt();
		} while(num1 > 1);
		sc.close();
	}
}
