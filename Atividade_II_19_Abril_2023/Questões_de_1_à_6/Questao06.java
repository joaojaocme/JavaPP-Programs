package Questão06;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, inter1 = 0, inter2 = 0;
		for(int i =1;i<=10;i++) {
			System.out.println("Digite um numero\n");
			num1 = sc.nextInt();
			if(num1 >= 10 && num1 <= 20) {
				inter2++;
			}
			else {
				inter1++;
			}
		}
		System.out.println("\n"+inter2+" Numeros entre (10 e 20)\n");
		System.out.println(inter1+" Numeros fora do intervalo de (10 e 20)");
		sc.close();
		}
		}
		
	

