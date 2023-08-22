package pangestu.nugraha.lambda.app;

import pangestu.nugraha.lambda.util.StringUtil;

import java.util.function.Predicate;

//Materi MethodeReferance
public class MethodeReferanceApp {
    public static void main(String[] args) {

        //Misal kita ingin membuat Lambda yang memanggil StringUtil yang kita buat
        //Karena Predicate returnya boolean maka kita akan gunaka Predicate
        //Berikut contoh menggunakan Anonymous Predicate
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return StringUtil.isLowerCase(value); //Kemudia masukan classnya pada return dan diikuti method nya
            }
        };
        //Dicek menggunakan .test()
        System.out.println(predicateIsLowerCase.test("Pangestu")); //Hasilnya False
        System.out.println(predicateIsLowerCase.test("pangestu")); //Hasilnya True
        System.out.println(predicateIsLowerCase.test("PANGESTU")); //Hasilnya False

        //Berikut contoh menggunakan Predicate di Lambda
        //Contoh 1 dengan block
        Predicate<String> predicateIsLowerCase2 = value -> {
            return StringUtil.isLowerCase(value); //Kemudia masukan classnya pada return dan diikuti method nya
        };

        //Dicek menggunakan .test()
        System.out.println(predicateIsLowerCase2.test("Pangestu")); //Hasilnya False
        System.out.println(predicateIsLowerCase2.test("pangestu")); //Hasilnya True
        System.out.println(predicateIsLowerCase2.test("PANGESTU")); //Hasilnya False


        //Contoh 2 tanpa block
        Predicate<String> predicateIsLowerCase3 = value -> StringUtil.isLowerCase(value); //Kemudia masukan classnya pada return dan diikuti method nya

        //Dicek menggunakan .test()
        System.out.println(predicateIsLowerCase3.test("Pangestu")); //Hasilnya False
        System.out.println(predicateIsLowerCase3.test("pangestu")); //Hasilnya True
        System.out.println(predicateIsLowerCase3.test("PANGESTU")); //Hasilnya False

        //Menggunakan contoh 2 tanpa block dengan Method Reference
        Predicate<String> predicateIsLowerCase4 = StringUtil::isLowerCase; //Kemudia masukan classnya pada return dan diikuti method nya

        //Dicek menggunakan .test()
        System.out.println(predicateIsLowerCase4.test("Pangestu")); //Hasilnya False
        System.out.println(predicateIsLowerCase4.test("pangestu")); //Hasilnya True
        System.out.println(predicateIsLowerCase4.test("PANGESTU")); //Hasilnya False

    }
}
