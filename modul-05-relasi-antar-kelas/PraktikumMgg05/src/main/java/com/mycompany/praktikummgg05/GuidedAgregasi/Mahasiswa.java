/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikummgg05.GuidedAgregasi;

public class Mahasiswa {
    private String NIM, Nama;

    public Mahasiswa (String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }
    //getter
    public String GetNIM() {
        return NIM;
    }

    public String GetNama () {
        return Nama;
    }
    
    //setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    String getNIM() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
