package view;

public class ReprodutorMusical implements ReprodutoVisualInterface{
    @Override
    public String tocar() {
        return "Iniciando Apple Music";
    }

    @Override
    public String pausar() {
        return "Pausando Apple Music";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Reproduzindo musica: " + musica + " no Apple Music";
    }
}
