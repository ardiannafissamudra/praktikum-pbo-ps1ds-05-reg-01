/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

public class Main {
    public static void main(String[] args) {
        ModelML regresi = new ModelRegresi("Regresi Linier", 500, 4);
        ModelML klasifikasi = new ModelKlasifikasi("Decision Tree", 800, 3);
        ModelML deepLearning = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        // menyimpan objek dalam satu array bertipe kelas induk (polimorfisme)
        ModelML[] daftarModel = {regresi, klasifikasi, deepLearning};

        int totalBiaya = 0;

        // perulangan untuk setiap elemen array
        for (ModelML model : daftarModel) {
            model.tampilkanInfo();
            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        // tampilkan total biaya dan uji coba method khusus
        System.out.println("Total biaya: " + totalBiaya);
        System.out.println("Biaya 10 epoch (Neural Network): " + deepLearning.hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + regresi.hitungBiaya(10));
        
        // downcasting untuk mengakses method dengan 2 parameter pada Regresi
        ModelRegresi regresiSpesifik = (ModelRegresi) regresi;
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresiSpesifik.hitungBiaya(10, 50));
    }
}