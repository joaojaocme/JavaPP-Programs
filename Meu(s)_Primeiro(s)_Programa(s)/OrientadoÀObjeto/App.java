package OrientadoÀObjeto;

public class App {

    //Método principal
    public static void main(String[] args) {

        //Objeto "user" instanciado da calsse "Users"
        Users user = new Users();
        user.setFirstName("Ronaldo");
        user.setLastName("Fenômeno");


        //Saída de dados
        user.getCompleteName();
    }
}
