package postwork;

public class GranolaDecorator implements Helado{

        private Helado helado;

        public GranolaDecorator(Helado helado){
            this.helado = helado;
        }

        @Override
        public String getDescripcion() {
            return helado.getDescripcion() + " con granola extra";
        }

        @Override
        public double getPrecio() {
            return helado.getPrecio() + 10.0;
        }
}
