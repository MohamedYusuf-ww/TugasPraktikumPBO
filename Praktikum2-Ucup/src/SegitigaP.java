/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class SegitigaP {
    public static void main(UbahS[] args) {
        double a = 6;
        double b = 8;

        // c = akar dari (a kuadrat + b kuadrat)
        double c = Math.sqrt((a * a) + (b * b));

        // keliling = jumlah ketiga sisi
        double keliling = a + b + c;

        System.out.println("Sisi a = " + a);
        System.out.println("Sisi b = " + b);
        System.out.println("Sisi c (miring) = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}