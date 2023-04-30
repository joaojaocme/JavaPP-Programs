package Questão10;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para fazermos a sua tabuada");
		int n = sc.nextInt();
		System.out.println("\n");
		int i = 1;
		while(i <= 10) {
			System.out.println(n +" X "+ i + " = "+ n*i+"\n");
			i++;
		}
		sc.close();
		}
}
		
	

