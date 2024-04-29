package ed;

import java.util.Scanner;

public class InvertirCifras {
    public static void main(String[] args) {
        int numero, invertido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero y positivo de tres cifras:");
        numero = scanner.nextInt();
        invertido = getInvertido(numero);
        System.out.println(invertido);
    }
    public static int getInvertido(int numero){
        if (numero>=100 && numero<1000){
            int cifra1 = numero / 100;
            int cifra2 = (numero / 10) % 10;
            int cifra3 = numero % 10;
            return cifra3 * 100 + cifra2 * 10 + cifra1;
        } else return 0;

    }
}
