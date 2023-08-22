package pangestu.nugraha.lambda.app;

import pangestu.nugraha.lambda.SimpleAction;

//Materi Pengenanalan Lambda
public class SimpelActionApp {
    public static void main(String[] args) {

        //Versi Anonymous Class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String nama) {
                return "Pangestu"; //Contoh returnnya "Pangestu"
            }
        };
        //Jika di print out
        System.out.println(simpleAction1.action("Pangestu"));

        /*
        Lamda adalah versi sederhana dari anonymous class
         */

        //Versi Lambda
        /*
        () langsung di tulis bagian parameternya. Karena di contoh tanpa parameter jadi langsung ()
        dilanjutkan dengan tanda -> Lalu Isi dari Method Actionnya. Tidak perlu disebutkan nama
        method nya

         */
        SimpleAction simpleAction2 = (String nama) -> {
            return "Pangestu";
        };
        //Jika di print out
        System.out.println(simpleAction2.action("Pangestu"));

        /*
        Beberapa Cara membuat Lambda
         */

        //Cara Pertama
        SimpleAction simpleAction3 = (String nama) -> {
            return "Halo " + nama;
        };

        //Cara kedua
        //Tipe datanya tidak harus disebutkan
        SimpleAction simpleAction4 = (nama) -> {
            return "Halo " + nama;
        };

        /*
        Lambda Tanpa Block
         */

        //Cara ketiga
        SimpleAction simpleAction5 = (String nama) -> "Halo " + nama; //tanpa menyebutkan keyword return

        //Cara Keempat
        SimpleAction simpleAction6 = (nama) -> "Halo " + nama; //Tanpa menyebutkan tipe datanya

        //Cara Kelima
        SimpleAction simpleAction7 = nama -> "Halo " + nama; //Jika hanya 1 tidak perlu menggunakan ()
    }
}
