package OOP;

public class Usuarios {

    //Propriedades
    private String firstName;
    private String lastName;


    //Métodos()

    //SETTERS
    public void setFirstName(String ola) {
        //Deixa os caracteres de firstName todos maiúsculos
        this.firstName = ola.toUpperCase();
    }

    public void setLastName(String lastName) {
        //Deixa os caracteres de lastName todos minúsculos
        this.lastName = lastName.toLowerCase();
    }


    //GETTER
    public void getCompleteName(){
        System.out.println(firstName + " " + lastName);
    }
}
