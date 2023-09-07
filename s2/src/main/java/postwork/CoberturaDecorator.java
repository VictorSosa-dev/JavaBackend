package postwork;

public class CoberturaDecorator implements Helado{

    private Helado helado;

    public CoberturaDecorator(Helado helado){
        this.helado = helado;
    }
    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + " con cobertura extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 20.0;
    }
}
