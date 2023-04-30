package Questão09;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, idade = 0, media = 0, soma = 0, quant = 0;
		while(i <= 3) {
			System.out.println("Digite sua nota\n");
			idade = sc.nextInt();
			soma = idade + soma;
			quant++;
			i++;
		}
		media = soma / quant;
		System.out.println("A media das suas notas é: "+ media);
		sc.close();
		}
		}
		
	

