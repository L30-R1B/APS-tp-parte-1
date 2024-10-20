
import java.util.ArrayList;
import java.util.List;
import modelo.local.Bloco;
import modelo.local.Cela;
import modelo.local.Prisao;
import modelo.pessoa.Guarda;
import modelo.pessoa.Prisioneiro;

public class Programa {

    public static void main(String[] args) throws Exception {
        //Inicialização de alguns guardas de exemplo
        List<Guarda> guardas = new ArrayList<>();
        guardas.add(new Guarda(0, "Marcos     ", "diurno ", "escolta"));
        guardas.add(new Guarda(1, "Carlinhos  ", "noturno", "disciplinar"));
        guardas.add(new Guarda(2, "Jailson    ", "diurno ", "supervisor"));
        guardas.add(new Guarda(3, "Nando Moura", "noturno", "escolta"));
        guardas.add(new Guarda(4, "Douglas    ", "diurno ", "disciplinar"));
        guardas.add(new Guarda(5, "Mathias    ", "noturno", "disciplinar"));
        //Inicialização de alguns prisioneiros de exemplo
        List<Prisioneiro> prisioneiros = new ArrayList<>();
        prisioneiros.add(new Prisioneiro(0, "Doguinho caramelo", "latiu na porta do STF", 25, "calmo"));
        prisioneiros.add(new Prisioneiro(1, "Luan do PVC", "Não ficou na atividade", 15, "conturbado"));
        prisioneiros.add(new Prisioneiro(2, "Alan Turing", "LGBT", 200, "deprimido"));
        prisioneiros.add(new Prisioneiro(3, "Yurizinho do mal", "Tráfico", 8, "agressivo"));
        prisioneiros.add(new Prisioneiro(4, "Peida Leite", "Homicidio", 15, "calmo"));
        prisioneiros.add(new Prisioneiro(5, "Tamanduá Fanho", "Furto", 5, "calmo"));
        prisioneiros.add(new Prisioneiro(6, "Pardal Cigano", "Estelionato", 1, "agressivo"));
        prisioneiros.add(new Prisioneiro(7, "Estrangulador da Leite", " . . . ", 7, "Agressivo"));
        prisioneiros.add(new Prisioneiro(8, "Naruto", "Furto", 3, "calmo"));
        prisioneiros.add(new Prisioneiro(9, "Toguro", "Dirigir embriagado", 1, "agressivo"));

        //Criação da prisão
        Prisao prisao = new Prisao(0, "Peçanha", "9 9987-6758", "p9187@gmail.com");
        
        //Criação de 3 blocos
        prisao.getBlocos().add(new Bloco(0));
        prisao.getBlocos().add(new Bloco(1));
        prisao.getBlocos().add(new Bloco(2));
        
        //Inserimento de guardas nos blocos criados
        prisao.getBlocos().get(0).insereGuarda(guardas.get(0));
        prisao.getBlocos().get(0).insereGuarda(guardas.get(1));
        prisao.getBlocos().get(1).insereGuarda(guardas.get(2));
        prisao.getBlocos().get(1).insereGuarda(guardas.get(3));
        prisao.getBlocos().get(2).insereGuarda(guardas.get(4));
        prisao.getBlocos().get(2).insereGuarda(guardas.get(5));

        //Criação de celas nos blocos
        prisao.getBlocos().get(0).getCelas().add(new Cela(0, 10, "fraca"));
        prisao.getBlocos().get(0).getCelas().add(new Cela(1, 12, "forte"));
        prisao.getBlocos().get(0).getCelas().add(new Cela(2, 17, "fraca"));
        prisao.getBlocos().get(1).getCelas().add(new Cela(3, 18, "fraca"));
        prisao.getBlocos().get(1).getCelas().add(new Cela(4, 19, "media"));
        prisao.getBlocos().get(1).getCelas().add(new Cela(5, 13, "media"));
        prisao.getBlocos().get(1).getCelas().add(new Cela(6, 15, "media"));
        prisao.getBlocos().get(2).getCelas().add(new Cela(7, 10, "forte"));

        //Inserimento de prisioneiros nas celas
        prisao.getBlocos().get(0).getCelas().get(0).inserePrisioneiro(prisioneiros.get(0));
        prisao.getBlocos().get(0).getCelas().get(0).inserePrisioneiro(prisioneiros.get(1));
        prisao.getBlocos().get(1).getCelas().get(0).inserePrisioneiro(prisioneiros.get(2));
        prisao.getBlocos().get(1).getCelas().get(0).inserePrisioneiro(prisioneiros.get(3));
        prisao.getBlocos().get(1).getCelas().get(1).inserePrisioneiro(prisioneiros.get(4));
        prisao.getBlocos().get(1).getCelas().get(1).inserePrisioneiro(prisioneiros.get(5));
        prisao.getBlocos().get(1).getCelas().get(1).inserePrisioneiro(prisioneiros.get(6));
        prisao.getBlocos().get(1).getCelas().get(3).inserePrisioneiro(prisioneiros.get(7));
        prisao.getBlocos().get(1).getCelas().get(3).inserePrisioneiro(prisioneiros.get(8));
        prisao.getBlocos().get(2).getCelas().get(0).inserePrisioneiro(prisioneiros.get(9));

        //Printa informações da prisão
        prisao.printaPrisao();
    }
}
