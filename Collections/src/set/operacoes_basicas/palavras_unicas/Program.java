package set.operacoes_basicas.palavras_unicas;

public class Program {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Adoleta");
        conjunto.adicionarPalavra("Lepeti");
        conjunto.adicionarPalavra("Petipola");
        conjunto.adicionarPalavra("Nescafé"); // Palavras duplicadas para atestar a
        conjunto.adicionarPalavra("Nescafé"); // condição de não haver duplicidade no Set

        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("Lepeti");
        conjunto.verificarPalavra("Lepeti");
        conjunto.exibirPalavrasUnicas();
    }
}
