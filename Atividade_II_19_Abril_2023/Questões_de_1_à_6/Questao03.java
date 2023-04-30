package Questão03;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("Escreva um numero de 1 a 10");
		int num1 = sc.nextInt();
		sc.close();
		if(num1 >= 1 && num1 <= 10) {
			System.out.println("Numero Valido\n");
			System.out.println("\nAqui esta a taboada do numero solicitado: \n\n");
			for(int i = 0;i <= 10;i++) {
				result = num1 * i;
				System.out.println(num1 +" Vezes "+ i+" e igual a "+ result +"\n");
				
			}
		}
		}
		}
	

