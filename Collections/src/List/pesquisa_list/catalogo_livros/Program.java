package List.pesquisa_list.catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Livro> livrosList = new ArrayList<>();
        livrosList.add(new Livro("Pokemon", "Eu", 2000));
        livrosList.add(new Livro("CDZ", "Tu", 1997));
        livrosList.add(new Livro("YUYU-Hakusho", "Nós", 2024));
        CatalogoLivros catalogoLivros = new CatalogoLivros(livrosList);

        System.out.println("Pesquisa por título");
        catalogoLivros.pesquisarPorTitulo("YUYU-Hakusho");

        System.out.println("\nPesquisa por autor");
        catalogoLivros.pesquisarPorAutor("Eu");

        System.out.println("\nPesquisa por período de lançamento");
        catalogoLivros.pesquisarPorIntervaloAnos(1995, 2000);
    }
}
