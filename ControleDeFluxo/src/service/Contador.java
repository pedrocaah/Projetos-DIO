package service;


import exceptions.ParametrosInvalidosException;

public class Contador {
    public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
