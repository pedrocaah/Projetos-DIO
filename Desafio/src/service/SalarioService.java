package service;

import model.Salario;

public class SalarioService {
    double valorImposto;

    public double calculoSalario(double valorBruto, double valorBeneficios) {
        if (valorBruto <= 1100.00) {
            valorImposto = 0.05;
        } else if (valorBruto <= 2500.00) {
            valorImposto = 0.1;
        } else {
            valorBeneficios = 0.15;
        }
        return valorBruto - valorImposto + valorBeneficios;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalarioService{");
        sb.append("valorImposto=").append(valorImposto);
        sb.append('}');
        return sb.toString();
    }
}
