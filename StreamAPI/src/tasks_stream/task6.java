package tasks_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean listaComNumerosMaiorQue10 = numeros.stream()
               .anyMatch(n -> n > 10);

       if (listaComNumerosMaiorQue10){
           System.out.println("Existem números maiores que 10 na lista");
       } else {
           System.out.println("Não existem números maiores que 10 na lista");
       }
    }
}
