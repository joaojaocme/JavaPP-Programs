package Questão11;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		while(n < 12 || n > 20) {
			System.out.println("Digite um numero entre 12 e 20");
			n = sc.nextInt();
			System.out.println("\n");
			if(n >= 12 && n <= 20) {
				System.out.println("you digited "+n);
			}
			else {
				System.out.println("Numero invalido");
			}
		}
		sc.close();
		}
}
