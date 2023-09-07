package postwork;

public class GalletaDecorator implements Helado{

    private Helado helado;

    public GalletaDecorator(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + " con galleta extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 15.0;
    }
}
