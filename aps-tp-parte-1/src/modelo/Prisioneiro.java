package modelo;

public class Prisioneiro extends Individuo{
    private final String CRIME;
    private int pena;
    private String comportamento;

    public Prisioneiro(int identificador, String nome, String crime, int pena, String comportamento){
        super(identificador, nome);
        this.CRIME = crime;
        this.pena = pena;
        this.comportamento = comportamento;
    }

    public String getCrime(){
        return this.CRIME;
    }

    public int getPena(){
        return this.pena;
    }

    public String getComportamento(){
        return this.comportamento;
    }

    public void setComportamento(String novoComportamento){
        this.comportamento = novoComportamento;
    }

    public void setPena(int novaPena){
        this.pena = novaPena;
    }

    public void printaPrisioneiro(){
        this.printaIndiviuo();
        System.out.println("CRIME COMETIDO (" + this.CRIME + "); PENA (" + this.pena + " anos); COMPORTAMENTO (" + this.comportamento + ")");
    }
}
