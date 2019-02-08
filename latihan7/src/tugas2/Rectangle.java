package tugas2;

public class Rectangle extends Shape{
     private int panjang;
     private int lebar;

    public Rectangle() {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public String getName() {
        return "Persegi Panjang";
    }

    @Override
    public double getArea() {
        return panjang*lebar;
    }
}
