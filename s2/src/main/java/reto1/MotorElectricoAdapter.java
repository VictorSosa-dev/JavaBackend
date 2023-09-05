package reto1;

public class MotorElectricoAdapter extends Motor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        System.out.println("Creando el motor electrico adaptado");
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor electrico adaptado");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();

    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adaptado");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico adaptado");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();

    }
}
