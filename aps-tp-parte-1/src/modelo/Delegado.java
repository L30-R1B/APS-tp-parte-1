package modelo;

public class Delegado extends Individuo{
    private final String TELEFONE;
    private final String EMAIL;

    public Delegado(int identificador, String nome, String telefone, String email){
        super(identificador, nome);
        this.TELEFONE = telefone;
        this.EMAIL = email;
    }

    public String getTelefone(){
        return this.TELEFONE;
    }

    public String getEmail(){
        return this.EMAIL;
    }

    public void printaDelegado(){
        this.printaIndiviuo();
        System.out.println("TELEFONE (" + this.TELEFONE + ") EMAIL (" + this.EMAIL + ")");
    }

}
