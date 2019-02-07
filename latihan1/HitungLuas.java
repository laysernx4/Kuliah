import java.util.Scanner;

public class HitungLuas {

    public cariLuasPersegiPanjang {
        int panjang;
        int lebar;
        int luas;
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa panjangnya : ");
        panjang = input.nextInt();

        System.out.print("Berapa lebarnya : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang adalah " + luas);
    }

}

/*

public class cariLuasLingkaran {

    public static void main (String[] args){

        int jari-jari ;

    }

}
*/