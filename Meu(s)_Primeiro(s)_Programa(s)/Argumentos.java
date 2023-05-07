public class Argumentos {
    public static void main(String[] args) {
        if (args.length == 3) {
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
            if (args[0].equals("somar")) {
                somar(x, y);
            } else if (args[0].equals("subtrair")) {
                subtrair(x, y);
            } else {
                System.out.println("ERROR");
            }
        } else if(args.length == 4) {
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[3]);
            if (args[0].equals("somar")) {
                somar(x, y);
            } else if (args[0].equals("subtrair")) {
                subtrair(x, y);
            } else {
                System.out.println("Operação inválida. Escolha 'somar' ou 'subtrair'.");
            }
        }
    }


    static void somar(int x, int y) {
        System.out.println(x + y);
    }
    static void subtrair(int x, int y) {
        System.out.println(x - y);
    }

}
