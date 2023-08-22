package pangestu.nugraha.lambda.app;


import java.util.function.Consumer;

//Materi Package java.util.fuction
public class ConsumerApp {
    public static void main(String[] args) {

     //Contoh anonymous class dari Interface Consumer dengan tipe data String
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };
        /*
        Jika di cek, yang sebenernya terjadi adalah kita memanggil method
                        accept(String value) {
                System.out.println(value);
            }
         */
        consumer.accept("Pangestu Nugraha");

        //Menggunakan Lambda
        Consumer<String> consumer2 = value -> System.out.println(value);

        consumer2.accept("Pangestu Nugraha");

    }
}
