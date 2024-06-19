import entity.Iphone;
import entity.Musica;
import entity.NavegadorNaInternet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Testanto a classe Musica
        Musica musica = new Musica();
        System.out.println("Digite o nome da música: ");

        String nome = sc.nextLine();
        musica.selecionarMusica(nome);
        musica.tocar();
        musica.pausar();

        // Testando a classe NavegadorNaInternet
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        System.out.println("Digite a URL: ");
        String url = sc.nextLine();
        navegador.adicionarAba(url);

        System.out.println(navegador.exibirPagina(0));
        navegador.atualizarPagina(0, "https://www.google.com");
        System.out.println(navegador.exibirPagina(0));

        System.out.println("===================================================================================");

        Iphone iphone = new Iphone("2010", "7", musica, navegador);
        iphone.liga();
        iphone.getReprodutor().selecionarMusica("Musica 2");
        iphone.getReprodutor().tocar();

        sc.close();


    }
}