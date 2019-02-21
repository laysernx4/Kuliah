package uts.pemogramanii2019.si_z;

public class Kubus extends BangunRuang{
    Kubus() {
    }

    double sisi;

    @Override
    public double hitungLuasPermukaan() {
        return 6*(Math.pow(sisi,2));
    }

    @Override
    public double hitungVoulume() {
        return Math.pow(sisi,3);
    }

    void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
