import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nilai;
        System.out.print("Masukkan Nilai Anda : A/B/C/D/E");
        System.out.print("\nNilai Anda = ");
        nilai = i.nextLine();
        switch (nilai){
            case "A" :
                System.out.print("\nExcellent");
                break;
            case "B" :
                System.out.print("\nGood Job!");
                break;
            case "C" :
                System.out.print("\nStudy Hard!");
                break;
            case "a" :
                System.out.print("\nExcellent");
                break;
            case "b" :
                System.out.print("\nGood Job!");
                break;
            case "c" :
                System.out.print("\nStudy Hard!");
                break;
            default:
                System.out.print("\nSorry, you failed");
        }
    }
}
