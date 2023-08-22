package pangestu.nugraha.lambda.app;

import java.util.function.Function;

//Materi Package java.util.function
public class FunctionApp {
    public static void main(String[] args) {

        //Contoh anonymous class dari Interface Function dengan tipe data String dan Integer
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };

        System.out.println(functionLength.apply("Pangestu"));

        //Menggunakan Lambda
        Function<String, Integer> functionLength2 = value -> value.length();

        System.out.println(functionLength2.apply("Pangestu"));

        //Jika memutuhkan parameter dan return value maka menggunakan Interface Function

    }
}
