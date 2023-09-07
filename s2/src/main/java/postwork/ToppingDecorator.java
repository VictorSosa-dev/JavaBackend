package postwork;

public class ToppingDecorator implements Helado{

    private Helado helado;

    public ToppingDecorator(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + " con topping extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 10.0;
    }
}
