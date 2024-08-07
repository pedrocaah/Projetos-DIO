package set.operacoes_basicas;

public class Program {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235); // códigos iguais para testar regra de négocio
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235); // de não haver códidos duplicados no set
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();
    }
}
