/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class WaktuCahaya {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000;       // km/s
        double jarakBulan = 384400;            // km
        double jarakMatahari = 152100000;      // 152,1 juta km

        double waktuBulan = jarakBulan / kecepatanCahaya;         // detik
        double waktuMatahari = jarakMatahari / kecepatanCahaya;   // detik
        double menitMatahari = waktuMatahari / 60;                // menit

        System.out.println("Waktu cahaya dari bumi ke bulan    : " + waktuBulan + " detik");
        System.out.println("Waktu cahaya dari bumi ke matahari : " + waktuMatahari + " detik");
        System.out.println("                                   (sekitar " + menitMatahari + " menit)");
    }
}