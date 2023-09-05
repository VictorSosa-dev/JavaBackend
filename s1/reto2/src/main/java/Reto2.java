public class Reto2 {
    public static void main(String[] args) {
        System.out.println("Suma de los primeros 100 numeros naturales");

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("La suma es: " + suma);
    }
}