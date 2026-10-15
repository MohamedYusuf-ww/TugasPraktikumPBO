/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class OperasiMatematika {
    public static void main(String[] args) {
        int x = 22;
        int y = 33;

        int tambah = x + y;
        int kurang = x - y;
        int kali = x * y;
        // x dijadiin double biar hasil bagi nya gak dibulatkan jadi 0
        double bagi = (double) x / y;

        System.out.println("x = " + x + " dan y = " + y);
        System.out.println("Penjumlahan : " + x + " + " + y + " = " + tambah);
        System.out.println("Pengurangan : " + x + " - " + y + " = " + kurang);
        System.out.println("Perkalian   : " + x + " * " + y + " = " + kali);
        System.out.println("Pembagian   : " + x + " / " + y + " = " + bagi);
    }
}