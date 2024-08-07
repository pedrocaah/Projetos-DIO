package list.operacoes_basicas.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    final private List<Item> listaItems;

    public CarrinhoDeCompras(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    public void adicionarItem(Item item) {
        listaItems.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : listaItems) {
            if (i.getNome().equals(nome)) {
                itensParaRemover.add(i);
            }
        }
        listaItems.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item i : listaItems) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        for (Item item : listaItems) {
            System.out.println(item);
        }
    }
}





