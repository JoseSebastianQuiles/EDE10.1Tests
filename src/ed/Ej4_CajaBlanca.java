package ed;

public class Ej4_CajaBlanca {
    public double obtenerMedia(double[] numeros) {
        double suma = 0;
        for (double valor: numeros) {
            if (valor >= 20 && valor <=50) {
                suma += valor;
            }
        }
        return suma / numeros.length;
    }
    //En el package images hay una captura de los grafos, también
}
