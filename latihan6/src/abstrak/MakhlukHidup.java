package abstrak;

public abstract class MakhlukHidup {

    public void bernapas(){
        System.out.println("Makhluk hidup bernapas pake cungur");
    }

    public void makan(){
        System.out.println("Makhluk hidup makan pake kokod");
    }

    //method ini harus diimplementasikan di subkelasnya
    public abstract void berjalan();
}
