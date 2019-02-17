package prauts1;
import java.util.Scanner;

public class LingkaranBesarKecil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r1, r2, C1, C2, c1, c2, L1, L2;

        System.out.println("Diketahui ada 2 lingkaran, C1 dan C2");
        System.out.println("========================================================");
        System.out.println("Posisi lingkaran pertama (C1) ada pada titik pusat (x1,y1)");
        System.out.println("Jari-jari pada lingkaran pertama adalah : ");
        r1 = input.nextInt();
        C1 = 2*r1*3.14;
        System.out.println("========================================================");
        System.out.println("Posisi lingkaran kedua (C2) ada pada titik pusat (x2,y2)");
        System.out.println("Jari-jari pada lingkaran kedua adalah : ");
        r2 = input.nextInt();
        C2 = 2*r2*3.14;
        System.out.println("========================================================");
        System.out.println("Jarak antara titik pusat kedua lingkaran tersebut adalah 15");
        System.out.println("Jika Luas C1 adalah " + C1 + " dan Luas C2 adalah " + C2 + " serta jarak antar titik pusat adalah 15");

        c1= r1 - r2;
        c2= r2 - r1;

        L1= r1+r2;
        L2= r1+r2;


        if (c2>15){
            System.out.println("Maka, C1 ada di dalam C2");
        }
        else if (c1>15){
            System.out.println("Maka, C2 ada di dalam C1");
        }
        else if (L1 > 15){
            if(c1 < 15) {
                if (L2 > 15) {
                    if (c2 < 15) {
                        System.out.println("Maka, C1 dan C2 beririsan");
                    }
                }
            }
        }
        else{
            System.out.println("Maka, C1 dan C2 saling lepas");
        }
    }
}