package pangestu.nugraha.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

//Materi Lambda di Optional Class
public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Pangestu");

        sayHello2("Nugi");
        sayHello2(""); // Null tetapi tidak eror

    }

    //Contoh ketika Null Eror
    public static void sayHello(String nama){
    String namaUpper = nama.toUpperCase();
        System.out.println("Halo " + namaUpper);
    }

    //Contoh 1 menggunakan Optional dengan Lambda
    public static void sayHello2(String nama){
        Optional<String> optionalNama = Optional.ofNullable(nama); //.ofNullable artinya dari value yang bisa null

        Optional<String> optionalNamaUpper = optionalNama.map(value -> value.toUpperCase());

        optionalNamaUpper.ifPresent(value -> System.out.println("Halo " + value));
    }

    //Contoh 2 menggunakan Optional dengan Lambda
    public static void sayHello3(String nama) {
        Optional.ofNullable(nama)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("Halo " + value),
                        () -> System.out.println("Halo "));

    }

}
