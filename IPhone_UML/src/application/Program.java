package application;

import view.AparelhoTelefonico;
import view.NavegadorInternet;
import view.ReprodutorMusical;

public class Program {
    public static void main(String[] args) {
        System.out.println("Métodos ReprodutorMusical");
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        String musica = "Faça dinheiro, se mantenha vivo";
        System.out.println(reprodutorMusical.tocar());
        System.out.println(reprodutorMusical.selecionarMusica(musica));
        System.out.println(reprodutorMusical.pausar());

        System.out.println();

        System.out.println("Métodos Aparelho Telefônico");
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        String numero = "11 94002-8922";
        System.out.println(aparelhoTelefonico.ligar(numero));
        System.out.println(aparelhoTelefonico.atender());
        System.out.println(aparelhoTelefonico.iniciarCorreioVoz());

        System.out.println();

        System.out.println("Métodos Navegador Internet");
        NavegadorInternet browser = new NavegadorInternet();
        String url = "https://web.dio.me/";
        System.out.println(browser.exibirPagina(url));
        System.out.println(browser.adicionarNovaAba());
        System.out.println(browser.atualizarPagina());
    }
}