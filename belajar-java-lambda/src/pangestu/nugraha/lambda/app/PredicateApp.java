package pangestu.nugraha.lambda.app;

import java.util.function.Predicate;

//Materi Package java.util.function
public class PredicateApp {
    public static void main(String[] args) {

        //Contoh anonymous class dari Interface Function dengan tipe data dan returnnya boolean
        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };
        //Kemudian di cek
        System.out.println(predicateCheckBlank.test("")); //Contoh ketika kosong hasilnya true
        System.out.println(predicateCheckBlank.test("Pangestu")); //Contoh ketika ada isinya hasilnya false

        //Contoh Menggunakan Interface Function dengan tipe data dan returnnya boolean dengan Lambda
        Predicate<String> predicateCheckBlank2 = value -> value.isBlank();

        //Kemudian di cek
        System.out.println(predicateCheckBlank2.test("")); //Contoh ketika kosong hasilnya true
        System.out.println(predicateCheckBlank2.test("Pangestu")); //Contoh ketika ada isinya hasilnya false

    }
}
