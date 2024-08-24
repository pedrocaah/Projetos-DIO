public abstract class AtividadesDoBootcamp {

    private final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private String cargaHoraria;

    public AtividadesDoBootcamp(String titulo, String descricao, String cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public abstract double calcularXp();
}
