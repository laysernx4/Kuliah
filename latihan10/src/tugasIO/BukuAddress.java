package tugasIO;
import java.util.*;
import java.io.*;

public class BukuAddress {
    private static void DaptarBaru() {
        try (FileOutputStream daptar = new FileOutputStream("daftaralamat.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukan Nama : " + "\t");
            String nama = input.nextLine();

            System.out.print("Masukan Alamat: " + "\t");
            String alamat = input.nextLine();

            daptar.write(nama.getBytes());
            daptar.write(alamat.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void LihatDaptar() throws IOException {
        try (FileInputStream input = new FileInputStream("daftaralamat.dat")) {
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Buku Alamat Masih Kosong :(");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner inputmenu = new Scanner(System.in);

        do {
            System.out.println("~~~ Buku Alamat ~~~");
            System.out.println("1. Daftar Alamat Baru");
            System.out.println("2. Lihat Daftar Alamat");
            System.out.println("3. Keluar Aplikasi");
            System.out.println(" ");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = inputmenu.nextInt();
            switch (pilihan) {
                case 1:
                    DaptarBaru();
                    break;
                case 2:
                    LihatDaptar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Silahkan pilih dengan masukan angka 1 atau 2");
                    break;
            }
            System.out.println(" ");
        } while (true);
    }
}