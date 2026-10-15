/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Suhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        // a. Celsius <-> Fahrenheit
        double cKeF = (C * 9 / 5) + 32;
        double fKeC = (F - 32) * 5 / 9;
        System.out.println("a. Celsius ke Fahrenheit");
        System.out.println(C + " C = " + cKeF + " F");
        System.out.println("   Fahrenheit ke Celsius");
        System.out.println(F + " F = " + fKeC + " C");
        System.out.println();

        // b. Celsius <-> Reamur
        double cKeR = C * 4 / 5;
        double rKeC = R * 5 / 4;
        System.out.println("b. Celsius ke Reamur");
        System.out.println(C + " C = " + cKeR + " R");
        System.out.println("   Reamur ke Celsius");
        System.out.println(R + " R = " + rKeC + " C");
        System.out.println();

        // c. Fahrenheit <-> Reamur
        double fKeR = (F - 32) * 4 / 9;
        double rKeF = (R * 9 / 4) + 32;
        System.out.println("c. Fahrenheit ke Reamur");
        System.out.println(F + " F = " + fKeR + " R");
        System.out.println("   Reamur ke Fahrenheit");
        System.out.println(R + " R = " + rKeF + " F");
    }
}