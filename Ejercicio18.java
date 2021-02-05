import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n1, n2;

        do {
            System.out.print("Introduzca la cantidad de números para introducir en el primer vector: ");
            n1 = leer.nextInt();

            if (n1 < 0) {
                System.out.println("Error, has introducido un número negativo");
            }

        } while (n1 < 0);

        do {
            System.out.print("Introduzca la cantidad de números para introducir en el segundo vector: ");
            n2 = leer.nextInt();

            if (n2 < 0) {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (n2 < 0);

        System.out.println("-----------------------------------------------");

        int[] v1 = new int[n1];
        int[] v2 = new int[n2];
        String[] v3 = new String[n1 + n2];

        for (int i = 0; v1.length > i; i++) {
            System.out.print("Introduzca el " + (i + 1) + "º número del 1º vector: ");
            v1[i] = leer.nextInt();

            v3[i] = "" + v1[i];
        }

        for (int i = v1.length; v2.length > i - v1.length; i++) {
            System.out.print("Introduzca el " + ((i + 1) - v1.length) + "º número del 2º vector: ");
            v2[i - v1.length] = leer.nextInt();

            v3[i] = "" + v2[i - v1.length];
        }

        leer.close();

        System.out.println("-----------------------------------------------");

        System.out.print("El número final es = ");

        for (int i = 0; v3.length > i; i++) {
            System.out.print(v3[i]);
        }

    }
}