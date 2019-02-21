package uts.pemogramanii2019.si_z;

public class Kerucut extends BangunRuang{
    double radius;
    double tinggi;

    Kerucut() {
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVoulume() {
        return (22*radius*radius*tinggi)/(3*7);
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.PI*radius*(radius+Math.sqrt((Math.pow(tinggi,2)+Math.pow(radius,2))));
    }
}
