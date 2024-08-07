package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Código não encontrado");
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public void contarConvidados() {
        System.out.println("Número de convidados: " + convidados.size());
    }

    public void exibirConvidados() {
        System.out.println("Lista de convidado:\n" + convidados);
    }
}
