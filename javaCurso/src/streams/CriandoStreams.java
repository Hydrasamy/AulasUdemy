package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
//        Usando o Consumer, o parâmetro é criado para dar um system.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
//        Criando streams, definindo os valores com Stream.of
//        Depois, é usando o parâmetro .forEach(print), para imprimir todos os valores definidos na stream.
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
//    Stream a partir de Array :
        Stream.of(maisLangs).forEach(print); //usando Stream of
        Arrays.stream(maisLangs).forEach(print); //Arrays.Stream passando o array inteiro.
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

    }
}
