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
        C1 = 2*r1;
        System.out.println("========================================================");
        System.out.println("Posisi lingkaran kedua (C2) ada pada titik pusat (x2,y2)");
        System.out.println("Jari-jari pada lingkaran kedua adalah : ");
        r2 = input.nextInt();
        C2 = 2*r2;
        System.out.println("========================================================");
        System.out.println("Jarak antara titik pusat kedua lingkaran tersebut adalah 5");
        System.out.println("Maka, jika diameter C1 adalah " + C1 + " dan diameter C2 adalah " + C2);

        c1 = C1 + 5;
        c2 = C2 + 5;

        L1 = c1 - c2;
        L2 = c2 - c1;


        if (L1 > L2){
            System.out.println("C1 dan C2 beririsan");
        }
        else if (L2 > L1){
            System.out.println("C1 dan C2 beririsan");
        }
        else if (L1 <= L2){
            System.out.println("C1 ada di dalam C2");
        }
        else if (L2 <= L1){
            System.out.println("C2 ada di dalam C1");
        }
        else{
            System.out.println("C1 dan C2 saling lepas");
        }
    }
}