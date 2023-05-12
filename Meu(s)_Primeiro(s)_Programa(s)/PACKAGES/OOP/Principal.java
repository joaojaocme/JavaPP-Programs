package OOP;

import java.util.Scanner;

public class Principal {

    //Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuarios[] user = new Usuarios[5];

        for(int i = 0;i < user.length;i++) {
            Usuarios actual = new Usuarios();
            System.out.println("Your first name: ");
            String fn = sc.nextLine();
            System.out.println("Your last name: ");
            String ln = sc.nextLine();
            actual.setFirstName(fn + i);
            actual.setLastName(ln+ i);
            user[i] = actual;
            System.out.println("\n");
        }

        //Saída de dados
        user[4].getCompleteName();
    }
}
