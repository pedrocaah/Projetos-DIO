package model;

public class Salario {
    double valorBruto;
    double percentualImposto;
    double Beneficios;

    public Salario() {
    }

    public Salario(double valorBruto, double percentualImposto, double beneficios) {
        this.valorBruto = valorBruto;
        this.percentualImposto = percentualImposto;
        this.Beneficios = beneficios;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public double getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(double beneficios) {
        Beneficios = beneficios;
    }
}
