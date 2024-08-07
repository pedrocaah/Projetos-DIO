package List.pesquisa_list.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void calcularSoma() {
        int soma = 0;
        for (Integer i : numeros) {
            soma += i;
        }
        System.out.println("Soma de todos os números da lista: " + soma);
    }

    public void encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        for (Integer i : numeros) {
            if (i > maior) {
                maior = i;
            }
        }
        System.out.println("Maior número da lista: " + maior);
    }

    public void encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        for (Integer i : numeros) {
            if (i < menor) {
                menor = i;
            }
        }
        System.out.println("Menor número da lista: " + menor);
    }

    public void exibirNumeros() {
        System.out.println("Lista de números: " + numeros);
    }
}
