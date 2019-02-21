package uts.pemogramanii2019.si_z;

public class Bola extends BangunRuang{
    Bola() {
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double hitungVoulume() {
        return 4*Math.PI*Math.pow(radius,3)/3;
    }

    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }
}
