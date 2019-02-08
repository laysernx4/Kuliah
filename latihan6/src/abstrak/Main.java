package abstrak;

public class Main {

    public static void main(String[]args){
        //Manusia babang = new Manusia();
        //babang.berjalan();
        //babang.bernapas();
        //babang.makan();

        //Person profil = new Person();
        Person p = new Student("Budi", "Bandung", "Informatika");

        System.out.println("Nama : " + p.getName());
        System.out.println("Alamat : " + p.getAddress());
        System.out.println("Jurusan : " + p.getDescription());

        Dosen d = new Dosen("Nama dosen, M.Si.", "Alamat tempat tinggalnya");
        d.setHonor(1000);
        d.setTunjangan(2000);

        System.out.println("Nama : " + d.getName());
        System.out.println("Alamat : " + d.getAddress());
        System.out.println("Gaji : " + d.getGaji());

    }
}
