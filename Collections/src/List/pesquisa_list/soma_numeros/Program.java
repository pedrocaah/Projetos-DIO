package List.pesquisa_list.soma_numeros;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);

        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
