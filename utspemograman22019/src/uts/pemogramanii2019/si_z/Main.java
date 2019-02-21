package uts.pemogramanii2019.si_z;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Program Menghitung Luas Permukaan dan Volume Bangun Ruang");
        System.out.println("======================================================");
        System.out.println("Pilih (pilih 0 untuk keluar):");
        System.out.println("1. Kubus");
        System.out.println("2. Bola");
        System.out.println("3. Kerucut");
        System.out.println("Pilihan Anda (1/2/3/0)?");
        Scanner ketik = new Scanner(System.in);

        while (true){
            int pilihan = ketik.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("Menghitung Luas Permukaan dan Volume Kubus");
                    System.out.println("Perlu diketahui nilai sisi dari Kubus");
                    System.out.println("Nilai sisi Kubus tersebut adalah ... \n(silahkan isi untuk nilai dari 'sisi' Kubus)");
                    Kubus k = new Kubus();
                    k.setSisi(ketik.nextDouble());
                    System.out.println("Volume dari Kubus dengan sisi " + k.sisi + "cm\nadalah " + k.hitungVoulume() + "cm kubik, dan");
                    System.out.println("Luas Permukaan dari Kubus dengan sisi " + k.sisi + "cm\nadalah " + k.hitungLuasPermukaan() + "cm kuadrat");
                    System.out.println(" ");
                    System.out.println("Silahkan masukan kembali angka 1/2/3 untuk menghitung luas permukaan dan volume,\natau 0 untuk keluar dari program");
                break;
                case 2:
                    System.out.println("Menghitung Luas Permukaan dan Volume Bola");
                    System.out.println("Perlu diketahui nilai radius dari Bola");
                    System.out.println("Nilai radius Bola tersebut adalah ... \n(silahkan isi untuk nilai dari 'radius' Bola)");
                    Bola b = new Bola();
                    b.setRadius(ketik.nextDouble());
                    System.out.println("Volume dari Bola dengan radius " + b.radius + "cm\nadalah " + b.hitungVoulume() + "cm kubik, dan");
                    System.out.println("Luas Permukaan dari Bola dengan radius " + b.radius + "cm\nadalah " + b.hitungLuasPermukaan() + "cm kuadrat");
                    System.out.println(" ");
                    System.out.println("Silahkan masukan kembali angka 1/2/3 untuk menghitung luas permukaan dan volume,\natau 0 untuk keluar dari program");
                break;
                case 3:
                    System.out.println("Menghitung Luas Permukaan dan Volume Kerucut");
                    System.out.println("Perlu diketahui nilai radius dan tinggi dari Kerucut");
                    System.out.println("Nilai radius Kerucut tersebut adalah ... \n(silahkan isi untuk nilai dari 'radius' Kerucut)");
                    Kerucut kc = new Kerucut();
                    kc.setRadius(ketik.nextDouble());
                    System.out.println("Nilai tinggi Kerucut tersebut adalah ... \n(silahkan isi untuk nilai dari 'tinggi' Kerucut)");
                    kc.setTinggi(ketik.nextDouble());
                    System.out.println("Volume dari Kerucut dengan radius " + kc.radius + "cm\ndan tinggi " + kc.tinggi + "cm\nadalah " + kc.hitungVoulume() + "cm kubik, dan");
                    System.out.println("Luas Permukaan dari Kerucut dengan radius " + kc.radius + "cm\ndan tinggi " + kc.tinggi + "cm\nadalah " + kc.hitungLuasPermukaan() + "cm kuadrat");
                    System.out.println(" ");
                    System.out.println("Silahkan masukan kembali angka 1/2/3 untuk menghitung luas permukaan dan volume,\natau 0 untuk keluar dari program");
                break;
                case 0:
                    System.out.println("Terima Kasih sudah menggunakan program hitung ini :D");
                    System.exit(0);
                break;
                default:
                    System.out.println("Silahkan masukan angka sesuai Bangun Ruang yang anda ingin hitung");

            }
        }
    }
}

