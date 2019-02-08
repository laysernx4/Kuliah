package tugas2;

public class Main {
    public static void main(String[]args) {
        Rectangle k = new Rectangle();
        k.setPanjang(20);
        k.setLebar(10);

        System.out.println("Nama Bentuk " + k.getName());
        System.out.println("Mempunyai Luas " + k.getArea() + " cm2");

        System.out.println(" ");
        System.out.println(" ");

        Circle l = new Circle();
        l.setR(15);
        l.setPhi(3.14);

        System.out.println("Nama Bentuk " + l.getName());
        System.out.println("Mempunyai luas " + l.getArea() + " cm2");

    }
}
