package abstrak;

public class Manusia extends MakhlukHidup {

    @Override
    public void berjalan() {
        System.out.println("Manusia berjalan dengan dua kaki");
    }

    @Override
    public void makan() {
        super.makan();
    }
}
