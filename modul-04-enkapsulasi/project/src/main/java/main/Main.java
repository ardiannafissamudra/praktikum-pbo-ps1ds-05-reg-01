/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.Dataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        // Objek 2
        Dataset d2 = new Dataset("Wine Quality");

        // Objek 3
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        // Array Objek
        Dataset[] daftarDataset = { d1, d2, d3 };

        // Cetak Laporan
        LaporanDataset laporan = new LaporanDataset();
        for (Dataset ds : daftarDataset) {
            laporan.cetak(ds);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
