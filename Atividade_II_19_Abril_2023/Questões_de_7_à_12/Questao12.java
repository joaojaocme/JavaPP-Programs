package Questão12;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario = 3, soma = 0, quant = 0, idade = 0, media = 0;
		int idadeMaisVelho = 0, f = 0, salarioMenor = 999999999, valor = 0;
		int idadeMaisNovo = 9999999, idadez = 0;
		String generoMaster = "";
		while(valor >= 0) {
			System.out.println("Qual o seu salário?");
			salario = sc.nextInt();
			if(salario < 0) {
				media = soma / quant;
				System.out.println("a) A media dos salário dos grupos = "+ media+"\n");
				System.out.println("b) A menor idade = "+ idadeMaisNovo +" e a maior idade = "+ idadeMaisVelho+"\n");
				System.out.println("c) A quantidade de mulheres na regiao = "+ f +"\n");
				System.out.println("d) A idade e o sexo da pessoa que possui o menor salário são respectivamente "+ idadez+" e "+generoMaster);
				sc.close();
				System.exit(0);
			}
			soma = salario + soma;
			quant++;
			System.out.println("\n");
			System.out.println("Digite sua idade \n");
			idade = sc.nextInt();
			if(idade > idadeMaisVelho) {
				idadeMaisVelho = idade;
			}
			if(idade < idadeMaisNovo) {
				idadeMaisNovo = idade;
			}
			if(idade < 0) {
				System.out.println("a) A media dos salário dos grupos = "+ media+"\n");
				System.out.println("b) A menor idade = "+ idadeMaisNovo +" e a maior idade = "+ idadeMaisVelho+"\n");
				System.out.println("c) A quantidade de mulheres na regiao = "+ f+"\n");
				System.out.println("d) A idade e o sexo da pessoa que possui o menor salário são respectivamente "+ idadez+" e "+generoMaster);
				sc.close();
				System.exit(0);
			}
			System.out.println("\n");
			System.out.println("\nQual o seu genero?");
			sc.nextLine();
			String gen = sc.nextLine();
			if(gen.equals("feminino")) {
				f++;
			}
			if(salario < salarioMenor) {
				salarioMenor = salario;
				idadez = idade;
				generoMaster = gen;
			}
			
			
		}
		sc.close();
		}
}
