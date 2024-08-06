package view;

public class NavegadorInternet implements NavegadorInternetInterface{
    @Override
    public String exibirPagina(String url) {
        return "Exibindo " + url + " no navegador";
    }

    @Override
    public String adicionarNovaAba() {
        return "Abrindo nova aba no navegador";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando navegador";
    }
}
