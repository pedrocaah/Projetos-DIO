package tasks_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaDosNumerosMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(mediaDosNumerosMaioresQue5);
    }
}
