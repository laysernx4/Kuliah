package abstrak;

public abstract class Pegawai extends Person{

    public Pegawai(String name, String address){
        super(name, address);
    }

    public abstract long getGaji();
}
