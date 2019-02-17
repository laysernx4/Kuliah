package prauts2;
import java.util.Scanner;

public class NyariNilaiBesarKeKecil {
    public static void main (String[] args){
        int angka;
        Scanner s = new Scanner(System.in);

        int a[] = new int[8];

        System.out.println("Masukkan angka untuk diurutkan : ");
        for (int i = 0; i < 8; i++)
        {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++)
        {
            for (int j = i + 1; j < 8; j++)
            {
                if (a[i] < a[j])
                {
                    angka = a[i];
                    a[i] = a[j];
                    a[j] = angka;
                }
            }
        }

        System.out.println("Nilai Terbesar ke Tercilnya adalah :");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(a[i]);
        }

    }
}
