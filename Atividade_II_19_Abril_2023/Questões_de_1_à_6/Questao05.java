package Questão05;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, pares = 0, impares = 0, div = 0;
		for(int i = 1;i <= 10; i++) {
			System.out.println("Digite um número\n");
			num1 = sc.nextInt();
			div = num1 % 2;
			if(div == 0) {
				pares++;
				
			}
			else {
				impares++;
			}
		}
		System.out.println("\n"+ pares +" Numeros pares e "+impares+" Numeros impares");
		sc.close();
		}
		}
		
	

