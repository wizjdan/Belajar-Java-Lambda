package pangestu.nugraha.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Materi Lambda di Collection
public class RemoveIfApp {
    public static void main(String[] args) {

        //Contoh menggunakan mutbale karena harus bisa dihapus
        List<String> nama = new ArrayList<>();

        //Memasukan data
        nama.addAll(List.of("Pangestu", "Nugraha", "Wizjdan", "Cio", "Cireng", "Ria", "Dumdum"));

        //Menghapus if dengan anonymous class
        nama.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5; //Jika panjang value nya lebih dari 5 maka akan dihapus
            }
        });
        System.out.println(nama);

        //Menghapus if dengan Lambda
        nama.removeIf(jeneng -> jeneng.length() > 5);

        System.out.println(nama);




    }
}
