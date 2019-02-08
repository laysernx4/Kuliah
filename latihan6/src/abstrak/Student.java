package abstrak;

public class Student extends Person {

    private String jurusan;

    public Student(String name, String address, String jurusan) {
        super(name, address);
        this.jurusan = jurusan;
    }

    @Override
    public String getDescription() {
        return "Mahasiswa jurusan " + jurusan;
    }
}
