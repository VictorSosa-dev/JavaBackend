package postwork;

public class HeladoSuave implements Helado{

    @Override
    public String getDescripcion() {
        return "Helado suave";
    }

    @Override
    public double getPrecio() {
        return 30.0;
    }
}

