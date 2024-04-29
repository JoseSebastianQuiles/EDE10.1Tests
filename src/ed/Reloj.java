package ed;

import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica que hora es, que minuto y que segundo por separado:");
        int hora=sc.nextInt();
        int minutos=sc.nextInt();
        int segundos=sc.nextInt();
        boolean horaCorrecta = getReloj(hora, minutos, segundos);
        System.out.println(horaCorrecta);
    }
    public static boolean getReloj(int hora, int minutos, int segundos){
        boolean horaCorrecta=false;
        if (hora <= 23 && hora >= 0 && minutos < 60 && minutos >= 0 && segundos < 60 && segundos >= 0) {
            horaCorrecta = true;
        }
        return horaCorrecta;
    }

}
