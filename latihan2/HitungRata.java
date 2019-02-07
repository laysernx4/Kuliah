import java.util.Scanner;

public class HitungRata {
    public static void main (String[] args){
        double rataRata;
        String emot;
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa nilai ujian ke-1 : ");
        int i1 = input.nextInt();

        System.out.print("Berapa nilai ujian ke-2 : ");
        int i2 = input.nextInt();

        System.out.print("Berapa nilai ujian ke-3 : ");
        int i3 = input.nextInt();

        rataRata = (i1 + i2 + i3) / 3;

        if (rataRata >= 60){
            emot = ":-)";
        }
        else{
            emot = ":-(";
        }

        System.out.println("Nilai Rata-Rata Kamu adalah : " + rataRata);
        System.out.println(emot);
    }
}