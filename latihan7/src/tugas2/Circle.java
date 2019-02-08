package tugas2;

public class Circle extends Shape{
    private int r;
    private double phi;

    public Circle() {
        this.r = r;
        this.phi = phi;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public String getName() {
        return "Lingkaran";
    }

    @Override
    public double getArea() {
        return r*phi;
    }
}
