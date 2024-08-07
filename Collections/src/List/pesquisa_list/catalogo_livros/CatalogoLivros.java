package List.pesquisa_list.catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livroList;

    public CatalogoLivros(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public void adicionarLivro(Livro livro) {
        this.livroList.add(livro);
    }

    public void removerLivro(String titulo) {
        List<Livro> livrosToRemove = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getTitulo().equals(titulo)) {
                livrosToRemove.add(l);
            }
            livrosToRemove.remove(l);
        }
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosDoAutor.add(l);
                System.out.println(l);
            }
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                livrosPorIntervalo.add(l);
                System.out.println(l);
            }
        }
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro l : livroList){
            if (l.getTitulo().equals(titulo)){
                System.out.println(l);
            }
        }
    }
}
