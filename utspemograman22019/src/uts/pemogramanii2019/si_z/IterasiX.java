package uts.pemogramanii2019.si_z;

public class IterasiX {
    public static void main (String[] args){
        for(int x = 1; x <= 100; x++) {
            if (((x % 3) == 0) && ((x % 7) == 0)) {
                System.out.println(x + " : Belajar Java menyenangkan");
            } else if ((x % 7) == 0) {
                System.out.println(x + " : Java");
            } else if ((x % 3) == 0) {
                System.out.println(x + " : Belajar");
            } else {
                System.out.println(x + " : -");
            }
        }
    }
}
