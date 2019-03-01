package tugasIO;
import java.util.*;
import java.io.*;

public class BukuAddress {
    private static void DaptarBaru() {
        try (FileOutputStream daptar = new FileOutputStream("daftaralamat.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.println("Nama Anda: ");
            String nama = input.nextLine();

            System.out.println("Alamat Anda: ");
            String alamat = input.nextLine();

            daptar.write(nama.getBytes());
            daptar.write(System.getProperty("line.separator").getBytes());
            daptar.write(alamat.getBytes());
            daptar.write(System.getProperty("line.separator").getBytes());
            daptar.write(System.getProperty("line.separator").getBytes());
            daptar.flush();
            daptar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void LihatDaptar() throws IOException {
        try (FileInputStream lihat = new FileInputStream("daftaralamat.dat")) {
            int daptar;
            while ((daptar = lihat.read()) != -1) {
                System.out.print((char) daptar);
            }
            lihat.close();
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