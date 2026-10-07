/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

public class Unguided01 {
    public static void main(String[] args) {
        final double KKM = 75.0;

        String[] namaMahasiswa = {"Abid", "Akbar", "Alwan"};

        double[][] nilaiModul = {
            {80.0, 85.0}, 
            {70.0, 65.0}, 
            {90.0, 90.0} 
        };

        System.out.println("REKAP NILAI");
        System.out.println("PRAKTIKUM\n");
        System.out.println("KKM: " + KKM + "\n");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            double modul1 = nilaiModul[i][0];
            double modul2 = nilaiModul[i][1];
            double rataRata = (modul1 + modul2) / 2.0;

            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1: " + modul1);
            System.out.println("Nilai Modul 2: " + modul2);
            System.out.println("Rata-rata    : " + rataRata);
            System.out.println("Status       : " + status);
            System.out.println();
        }
    }
}
