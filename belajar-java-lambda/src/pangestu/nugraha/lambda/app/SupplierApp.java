package pangestu.nugraha.lambda.app;

import java.util.function.Supplier;

//Materi Package java.util.function
public class SupplierApp {
    public static void main(String[] args) {

        //Contoh anonymous class dari Interface Supplier dengan tipe data String
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Pangestu Nugraha"; //Contoh returnnya "Pangestu Nugraha
            }
        };
        //Dicek menggunakan .get()
        System.out.println(supplier.get()); //Hasilnya "Pangestu Nugraha" sesuai dengan return

        //Contoh Menggunakan Interface Supplier dengan tipe data String dengan Lambda
        Supplier<String> supplier2 = () -> {
            return "Pangestu Nugraha 2"; //Contoh returnnya "Pangestu Nugraha
        };

        //Atau
        Supplier<String> supplier3 = () -> "Pangestu Nugraha 3"; //Contoh returnnya "Pangestu Nugraha

        //Dicek menggunakan .get()
        System.out.println(supplier2.get()); //Hasilnya "Pangestu Nugraha" sesuai dengan return

        System.out.println(supplier3.get()); //Hasilnya "Pangestu Nugraha" sesuai dengan return

    }
}
