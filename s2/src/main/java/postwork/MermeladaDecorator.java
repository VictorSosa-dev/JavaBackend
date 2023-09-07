package postwork;

public class MermeladaDecorator implements Helado{

        private Helado helado;

        public MermeladaDecorator(Helado helado){
            this.helado = helado;
        }

        @Override
        public String getDescripcion() {
            return helado.getDescripcion() + " con mermelada extra";
        }

        @Override
        public double getPrecio() {
            return helado.getPrecio() + 10.0;
        }
}
