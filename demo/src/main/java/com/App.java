package demo.src.main.java.com;

public class App {
    public static void main(String[] args) {

        Empregado e = new Empregado(5000);
        
        Gerente g = new Gerente(8000, 2000);
        
        System.out.printf("Salário do empregado: %.2f%n", e.getProventos());
        System.out.printf("Salário do gerente: %.2f%n", g.getProventos());

        System.out.printf("Bônus do gerente: %.2f%n", ( (Gerente) g).getBonus());

    }
}

