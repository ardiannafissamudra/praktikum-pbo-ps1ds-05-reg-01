/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikummgg05.GuidedAgregasi;

public class Jurusan {
    private String KodeJurusan, NamaJurusan;
    private Mahasiswa[] Daftar = new Mahasiswa[10];
    private static int JmlMhs = 0;

    public Jurusan (String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }

    // Ubah menjadi AddMahasiswa (dengan huruf A kapital)
    public void AddMahasiswa (Mahasiswa m) {
        this.Daftar[JmlMhs] = m;
        this.JmlMhs++;
    }

    // Ubah menjadi DisplayMahasiswa (dengan huruf D kapital)
    public void DisplayMahasiswa () {
        int i;
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan : " + this.NamaJurusan);
        System.out.println("Daftar Mahasiswa :");
        for (i = 0; i < JmlMhs; i++)
            System.out.println(Daftar[i].GetNIM() + " " + Daftar[i].GetNama());
    }
}
