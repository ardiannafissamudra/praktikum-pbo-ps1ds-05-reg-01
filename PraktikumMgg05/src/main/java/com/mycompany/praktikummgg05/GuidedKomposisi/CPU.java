/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikummgg05.GuidedKomposisi;


public class CPU {
    private String merk;
    private int kecepatan;

    public CPU(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void displaySpec() {
        System.out.println(this.merk + ", " + this.kecepatan + " MHz");
    }
}
