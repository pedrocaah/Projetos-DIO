package view;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface{
    @Override
    public String ligar(String numero) {
        return "Ligando para o número:" + numero;
    }

    @Override
    public String atender() {
        return "Atender chamada recebida";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "No momento não posso atender, deixe seu recado após o sinal";
    }
}
