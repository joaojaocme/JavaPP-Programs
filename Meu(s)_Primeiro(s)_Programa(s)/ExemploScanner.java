import java.util.Scanner;
import java.util.Random;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int zo = gerador.nextInt(10);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        System.out.println("Você digitou o número " + numero);
        sc.close();
        if (numero < 10) {
            System.out.println("Seu número aleatório é: " + zo);
        }

    }
}