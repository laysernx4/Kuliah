import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nilai;
        char nilai2;
        String grade;
        System.out.print("Masukkan Nilai Anda : A/B/C/D/E");
        System.out.print("\nNilai Anda = ");
        nilai = i.nextLine();
        //pakeSwitch
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


            //pakeIF

                System.out.print("Masukkan Nilai (A,B,C,D,E) : ");
                nilai2 = i.next().charAt(0);

                if (nilai2 == 'A') {
                    grade = "Excellent";
                }
                else if (nilai2 == 'B') {
                    grade = "Good job!";
                }
                else if (nilai2 == 'C') {
                    grade = "Study harder!";
                }
                else if (nilai2 == 'a') {
                    grade = "Excellent";
                }
                else if (nilai2 == 'b') {
                    grade = "Good job!";
                }
                else if (nilai2 == 'c') {
                    grade = "Study harder!";
                }
                else {
                    grade = "Sorry, you failed.";
                }

                System.out.println(grade);
        }
    }
}
