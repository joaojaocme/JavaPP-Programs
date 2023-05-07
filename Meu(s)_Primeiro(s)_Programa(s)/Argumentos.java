public class Argumentos {
    public static void main(String[] args) {
        /*Neste primeiro IF, analisa-se se o tamanho dos argumentos é igual a 3 através
        * da instrução "length", que conta o tamanho do array(uma especie de vetor estranho do java kk).
        * Exemplo:  se eu escrever no cmd "java Argumentos somar 5 10" ele ira contar
        * como 3 argumentos pois "java Argumentos" é o nome do programa e "somar 5 10" são
        * os argumentos.     Agora, caso você escreva mais de 3 argumentos, o programa não inicializará. */
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
            /*Aqui é quase a mesma coisa do primeiro if/length, a diferença é que
            * irá analisar se o tamanho do array de argumentos digitados é
            * igual a 4.   Fiz isso à toa, na intenção de fazer com que o usuário
            * desse meu programa não tenha que contar tanto com improbabilidades.  Tipo, ela pode escrever
            * o que quiser no segundo argumento, EX:  "por" "pelo" "com". no intuito que faça sentido para a pessoa e
            * não para a máquina. */
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

/*Isso são 2 sub-rotinas que ambas foram utilizadas 2 vezes durante o processo.*/
    static void somar(int x, int y) {
        System.out.println(x + y);
    }
    static void subtrair(int x, int y) {
        System.out.println(x - y);
    }
    /*OBS: esse código so tem como ser executado através de cmd no caso de sua IDE não disponibilizar as configurações dos argumentos
    * antes de executar.
    *
    * Quando for executar, coloque o caminho do diretório, o qual se encontra com o arquivo desse programa, no CMD e em seguida
    * escreva "javac {nome do arquivo}.java" sem as aspas.  e depois de compilar com o javac, escreva "java {nome do arquivo}
    * {arg 0} {arg 1}   opcional:{arg 2}   {arg 3}"  sem aspas novamente.   E pronto, o programa estará rodando
    *
    * Instruções: arg0: escreva apenas "somar" ou "subtrair", dependendo do que você quer fazer.
    *             arg1: escreva um número inteiro de sua preferência.
    *             arg2: escreva qualquer coisa, não interfere no código.
    *             arg3: escreva outro número inteiro de sua preferência. Lembrando que se for subtração, a propriedade
    *                   não é comutativo, então o arg1 será o minuendo e o arg3 será o subtraendo */

}
