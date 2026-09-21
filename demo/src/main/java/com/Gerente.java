package demo.src.main.java.com;

public class Gerente extends Empregado {

    private double bonus;

    public Gerente(double salario, double bonus) {
        super(salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getProventos() {
        return super.getProventos() + bonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gerente{");
        sb.append("salario=").append(getSalario());
        sb.append(", bonus=").append(bonus);
        sb.append('}');
        return sb.toString();
    }

}
