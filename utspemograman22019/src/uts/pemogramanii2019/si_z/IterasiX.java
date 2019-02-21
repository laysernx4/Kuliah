package uts.pemogramanii2019.si_z;

public class IterasiX {
    public static void main (String[] args){
        for(int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 7) == 0)) {
                System.out.println(i + " : Belajar Java menyenangkan");
            } else if ((i % 7) == 0) {
                System.out.println(i + " : Java");
            } else if ((i % 3) == 0) {
                System.out.println(i + " : Belajar");
            } else {
                System.out.println(i + " : -");
            }
        }
    }
}
