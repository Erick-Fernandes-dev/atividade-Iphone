package entity;

import java.util.ArrayList;
import java.util.List;

public class NavegadorNaInternet {

    private List<String> abas = new ArrayList<String>();

    public void adicionarAba(String aba){
        abas.add(aba);
    }

    public String exibirPagina(int indice){
        return abas.get(indice);
    }

    public void atualizarPagina(int indice, String novaPagina){
        abas.set(indice, novaPagina);
    }
}
