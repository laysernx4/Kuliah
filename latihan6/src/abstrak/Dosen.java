package abstrak;

public class Dosen extends Pegawai{

    private long honor;
    private long tunjangan;

    public Dosen(String name, String address){
        super(name, address);
    }

    public void setHonor(long honor) {
        this.honor = honor;
    }

    public void setTunjangan(long tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public long getGaji() {
        return honor + tunjangan;
    }

    @Override
    public String getDescription() {
        return super.getName() + "adalah Dosen";
    }
}
