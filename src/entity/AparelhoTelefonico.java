package entity;

public class AparelhoTelefonico {

    private Musica reprodutor;
    private NavegadorNaInternet navegador;

    public AparelhoTelefonico(Musica reprodutor, NavegadorNaInternet navegador) {
        this.reprodutor = reprodutor;
        this.navegador = navegador;
    }

    public AparelhoTelefonico() {
        this.reprodutor = new Musica();
        this.navegador = new NavegadorNaInternet();
    }

    public Musica getReprodutor() {
        return reprodutor;
    }

    public NavegadorNaInternet getNavegador() {
        return navegador;
    }

    public void liga(){
        System.out.println("Ligando o aparelho...");
    }

    public void desliga(){
        System.out.println("Desligando o aparelho...");
    }

    public String InciarCorreioDeVoz(String mensagem){
        return "Iniciando correio de voz com a mensagem: " + mensagem;
    }
}
