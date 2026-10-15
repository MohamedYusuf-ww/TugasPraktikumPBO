public class UbahS{
    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";

        a = a.toLowerCase(); // jadi huruf kecil semua
        b = b.toUpperCase(); // jadi huruf besar semua

        System.out.println(a); // saya belajar java
        System.out.println(b); // SAYA BELAJAR JAVA

        // konversi int ke String
        int angka = 2024;

        String cara1 = String.valueOf(angka);
        String cara2 = Integer.toString(angka);
        String cara3 = "" + angka;

        System.out.println("Cara 1 (String.valueOf)   : " + cara1);
        System.out.println("Cara 2 (Integer.toString) : " + cara2);
        System.out.println("Cara 3 (digabung string)  : " + cara3);
    }
}