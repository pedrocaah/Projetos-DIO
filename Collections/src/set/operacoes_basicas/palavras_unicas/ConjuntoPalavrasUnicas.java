package set.operacoes_basicas.palavras_unicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        for (String s : palavras) {
            if (s.equals(palavra)) {
                System.out.println("Palavra encontrada: " + s);
                break;
            } else {
                System.out.println("Palavra não encontrada");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public Set<String> getPalavras() {
        return palavras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavras);
    }
}
