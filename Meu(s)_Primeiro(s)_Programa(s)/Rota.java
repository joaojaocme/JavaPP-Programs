import java.util.Scanner;

public class Rota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua idade");
        int idade = sc.nextInt();
        calc(idade);
    }

    /* Essa subrotina irá fornecer o valor da sua idade elevado ao quadrado */
    static void calc(int nadaver) {
        int multi = 0;
        multi = nadaver * nadaver;
        System.out.println(multi);
    }

}
