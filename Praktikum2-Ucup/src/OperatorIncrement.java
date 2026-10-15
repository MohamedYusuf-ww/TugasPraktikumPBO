/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class OperatorIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // post-increment: nilainya dipakai dulu, baru ditambah 1
        System.out.println("Post-increment (a++): " + a++);
        System.out.println("Nilai a sekarang: " + a);

        // pre-increment: ditambah 1 dulu, baru dipakai
        System.out.println("Pre-increment (++b): " + ++b);
        System.out.println("Nilai b sekarang: " + b);
    }
}