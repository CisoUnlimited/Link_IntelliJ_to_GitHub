import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int numero;
        for (int i = 0; i < 10; i++) {
            numero = ThreadLocalRandom.current().nextInt(1,101);
            System.out.print(numero+ " ");
        }
        System.out.println("Fin de la operación");
        System.out.println("Presiona Enter para salir...");
        new Scanner(System.in).nextLine();
    }
}