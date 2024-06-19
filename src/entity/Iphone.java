package entity;

public class Iphone extends AparelhoTelefonico {

    private String anoLancamento;
    private String versao;

    public Iphone(String anoLancamento, String versao, Musica reprodutor, NavegadorNaInternet navegador) {
        super(reprodutor, navegador);
        this.anoLancamento = anoLancamento;
        this.versao = versao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public String getVersao() {
        return versao;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
