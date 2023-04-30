package Questão04;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0, soma = 0, media = 0, quant = 0;
		for(int i = 1;i <= 4; i++) {
			System.out.println("Digite sua idade");
			idade = sc.nextInt();
			soma = soma + idade;
			quant++;
		}
		media = soma / quant;
		System.out.println("A média das idades é "+ media);
		sc.close();
		}
		}
		
	

