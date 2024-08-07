package list.operacoes_basicas.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Item> itens = new ArrayList<>();
        itens.add(new Item("Televisão", 1500.00, 5));
        itens.add(new Item("Fogão", 800.00, 3));
        itens.add(new Item("Cama", 600.00, 2));
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(itens);
        carrinhoDeCompras.exibirItens();
        System.out.printf("Valor total do carrinho: %.2f", carrinhoDeCompras.calcularValorTotal());
        System.out.println();
        carrinhoDeCompras.removerItem("Televisão");
        carrinhoDeCompras.exibirItens();

    }
}
