package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cela {
    int identificador;
    int capacidade;
    String nivelSeguranca;
    List<Prisioneiro> prisioneiros;
    List<Guarda> guardas;

    public Cela(int identificador, int capacidade, String nivelSeguranca){
        this.identificador = identificador;
        this.capacidade = capacidade;
        this.nivelSeguranca = nivelSeguranca;
        this.prisioneiros = new ArrayList<>();
        this.guardas = new ArrayList<>();
    }

    public int getIdentificador(){
        return this.identificador;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public String nivelSeguranca(){
        return this.nivelSeguranca;
    }

    public boolean inserePrisioneiro(Prisioneiro prisioneiro){
        if(this.prisioneiros.size() < this.capacidade){
            return this.prisioneiros.add(prisioneiro);
        }
        return false;
    }

    public boolean insereGuarda(Guarda guarda){
        return this.guardas.add(guarda);
    }

    public boolean removePrisioneiro(int identificador){
        for(Prisioneiro prisioneiroAtual : this.prisioneiros){
            if(prisioneiroAtual.getIdentificador() == identificador){
                return this.prisioneiros.remove(prisioneiroAtual);
            }
        }
        return false;
    }

    public boolean removeGuarda(int identificador){
        for(Guarda guardaAtual : this.guardas){
            if(guardaAtual.getIdentificador() == identificador){
                return this.guardas.remove(guardaAtual);
            }
        }
        return false;
    }

}
