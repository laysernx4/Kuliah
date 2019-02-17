package prauts3;

public class Manajer extends Employee {
    private long bonus;

    public Manajer(String name, String address, long salary, long bonus) {
        super(name, address, salary);
        this.bonus = bonus;
    }

    public long getBonus() {
        return bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary() + bonus;
    }
}
