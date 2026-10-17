/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikummgg05.GuidedAgregasi;

public class main {
    public static void main(String[] args) {
        runGuided2();
    }

    public static void runGuided2() {
        Mahasiswa m1 = new Mahasiswa("189113400148", "Gatot");
        Mahasiswa m2 = new Mahasiswa("189113400149", "Jarwo");

        Jurusan prodi = new Jurusan("SD", "Sains Data");

        prodi.AddMahasiswa(m1);
        prodi.AddMahasiswa(m2);

        prodi.DisplayMahasiswa();
    }
}