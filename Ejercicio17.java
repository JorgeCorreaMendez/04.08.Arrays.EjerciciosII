import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        do {
            System.out.print("Introduzca la cantidad de números para introducir: ");
            n = leer.nextInt();

            if (n < 0) {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (n < 0);

        int[] nCapicúa = new int[n];
        String Capicúa = "";

        for (int i = 0; nCapicúa.length > i; i++) {
            do {
                System.out.print("Introduzca el " + (i + 1) + "º número: ");
                nCapicúa[i] = leer.nextInt();

                if (nCapicúa[i] < 0 || nCapicúa[i] > 9) {
                    System.out.println("Error, has introducido un número negativo o mayor de 10");
                }
            } while (nCapicúa[i] < 0 || nCapicúa[i] > 9);

            Capicúa += "" + nCapicúa[i];
        }

        leer.close();

        System.out.println("--------------------------------");

        String CapicúaInvertido = "";

        for (int i = nCapicúa.length - 1; i >= 0; i--) {
            CapicúaInvertido += nCapicúa[i];
        }

        if (Capicúa.equals(CapicúaInvertido)) {
            System.out.println("El número " + Capicúa + " es un número Capicúa");
        } else {
            System.out.println("El número " + Capicúa + " no es un número Capicúa");
        }
    }
}
