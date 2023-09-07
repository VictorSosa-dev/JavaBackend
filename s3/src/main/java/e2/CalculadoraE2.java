package e2;

public class CalculadoraE2 {

    private CalculadoraDao dao;

    public int suma(int a, int b) {
        return a + b + dao.findValorConstante();
    }

    public int resta(int a, int b) {
        return a - b + dao.findValorConstante();
    }

    public int multiplica(int a, int b) {
        return a * b + dao.findValorConstante();
    }
}
