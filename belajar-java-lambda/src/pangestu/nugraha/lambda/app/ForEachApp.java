package pangestu.nugraha.lambda.app;

import java.util.List;
import java.util.function.Consumer;

//Materi Lambda di Collection
public class ForEachApp {
    public static void main(String[] args) {

        //Contoh menggunakan immutbale
        List<String> nama = List.of("Pangestu", "Nugraha", "Wizjdan", "Cio", "Cireng", "Ria", "Dumdum");

        //Pengecekan menggunakan for loop
        for (var name : nama){
            System.out.println(name);
        }

        //Pengecekan menggunakn ForEach dengan anonymous class
        nama.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        //Pengecekan menggunakan ForEach dengan Lambda
        nama.forEach(value -> System.out.println(value));

        //Pengecekan menggunakan ForEach dengan Lambda Method Referance
        nama.forEach(System.out::println);

    }
}
