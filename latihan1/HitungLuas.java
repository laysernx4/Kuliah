import java.util.Scanner;

public class HitungLuas {

    public static void main(String[] args) {
        int panjang;
        int lebar;
        int luas;
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Berapa panjangnya : ");
        panjang = input.nextInt();

        System.out.print("Berapa lebarnya : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang adalah " + luas);

        double jari;
        double luasBuleud;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Berapa jari-jarinya : ");
        jari = input.nextInt();

        luasBuleud = jari * 3.14 * 2;

        System.out.println("Luas Lingkarannya adalah " + luasBuleud);

    }

}

/*

public class cariLuasLingkaran {

    public static void main (String[] args){

        int jari-jari ;

    }

}
*/