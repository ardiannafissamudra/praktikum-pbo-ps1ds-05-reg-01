package UnguidedMgg03;

import java.util.Arrays;

import java.util.Arrays;

public class MainSuhu {

    public static void main(String[] args) {
        double[] suhuHarian = {30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9};
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println("\nIndex hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());

        pengolah.isiDataKosong();

        System.out.println("\n=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.printf("\nRata-rata : %.2f°C\n\n", pengolah.hitungRataRata());

        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));

        /* 
         * Penjelasan: Array bertipe data referensi (Pass by Reference). 
         * Constructor PengolahSuhu menyimpan alamat memori array yang sama dengan variabel di main. 
         * Oleh karena itu, perubahan isi array di dalam method isiDataKosong() otomatis 
         * mengubah variabel suhuHarian yang ada di main.
         */
    }
}
