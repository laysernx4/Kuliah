package prauts3;

public class Main {
    public static void main (String[] args){
        System.out.println("=====================================");

        Employee boss = new Manajer("Boss","di Kantor", 4300000, 3600000);
        System.out.println("Nama : "+ boss.getName());
        System.out.println("Alamat : " + boss.getAddress());
        System.out.println("Gaji : Rp." + boss.getSalary());

        System.out.println("=====================================");

        Employee staff1 = new Staff("Staff-1","Meja Kerja-1",3600000);
        System.out.println("Nama : "+ staff1.getName());
        System.out.println("Alamat : " + staff1.getAddress());
        System.out.println("Gaji : Rp." + staff1.getSalary());

        System.out.println("=====================================");

        Employee staff2 = new Staff("Staff-2","Meja Kerja-2",4300000);
        System.out.println("Nama : "+ staff2.getName());
        System.out.println("Alamat : " + staff2.getAddress());
        System.out.println("Gaji : Rp." + staff2.getSalary());

        System.out.println("=====================================");

    }
}
