package entity;

public class Musica  implements  ReprodutorMusical{

    private String nome;

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + this.nome);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música: " + this.nome);

    }

    @Override
    public String selecionarMusica(String musica) {
        this.nome = musica;
        return getNome();
    }

    public String getNome() {
        return nome;
    }
}
