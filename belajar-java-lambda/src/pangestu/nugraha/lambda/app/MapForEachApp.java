package pangestu.nugraha.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//Materi Lambda di Collection
public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("namaDepan", "Pangestu");
        map.put("namaTengah", "Nugraha");
        map.put("namaBelakang", "Wizjdan");

        //Pengecekan menggunakan for loop
        for (var nama : map.entrySet()){
            System.out.println(nama.getKey() + " : " + nama.getValue());
        }

        //Pengecekan menggunakan ForEach Anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        //Pengecekan menggunakan ForEach Lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
