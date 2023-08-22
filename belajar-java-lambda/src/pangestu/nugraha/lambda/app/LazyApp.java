package pangestu.nugraha.lambda.app;

import java.util.function.Supplier;

//Materi Lambda Sebagai Lazy Parameter
public class LazyApp {
    public static void main(String[] args) {
    testScore(70, getName());

    testScoreSatu(70, () -> getName());
    }

    //Bukan Lazy Parameter
    public static void testScore(int score, String name){
        if (score > 80){
            System.out.println(name + ", Anda Lulus");
        }else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }
    }
    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Nugi";
    }

    //Lazy Parameter
    public static void testScoreSatu(int score, Supplier<String> name) {
        if (score > 80){
            System.out.println(name.get() + ", Anda Lulus");
        }else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }
    }
}
