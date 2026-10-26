/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikummgg05.GuidedAsosiasi;

public class Dosen {
    private String kodeDosen;
    private String namaDosen;

    //Setter
    public void setKodeDosen (String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen (String namaDosen) {
        this.namaDosen = namaDosen;
    }

    //Getter
    public String getKodeDosen () {
        return this.kodeDosen;
    }

    public String getNamaDosen () {
        return this.namaDosen;
    }

    public void giveScore (Mahasiswa s, int nilai) {
        s.setNilai (nilai);
    }

    public int getScore (Mahasiswa s) {
        return s.getNilai();
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("130118383");
        m.setNama ("Budi");

        Dosen d = new Dosen();
        d.giveScore (m, 90);

        System.out.println("Nim: "+m.getNim());
        System.out.println("Nama: "+m.getNama());
        System.out.println("Nilai : "+d.getScore(m));
    }
}
