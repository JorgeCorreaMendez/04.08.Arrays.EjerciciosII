import java.util.Scanner;

public class Ejercicio19 {
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

        int max;

        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }

        int[] v1 = new int[n1];
        int[] v2 = new int[n2];
        int[] v3 = new int[max];

        for (int i = 0; v1.length > i; i++) {
            System.out.print("Introduzca el " + (i + 1) + "º número del 1º vector: ");
            v1[i] = leer.nextInt();
        }

        for (int i = v1.length; v2.length > i - v1.length; i++) {
            System.out.print("Introduzca el " + ((i + 1) - v1.length) + "º número del 2º vector: ");
            v2[i - v1.length] = leer.nextInt();
        }

        leer.close();

        if (v1.length == v2.length) {
            for (int i = 0; v3.length > i; i++) {
                v3[i] = v1[i] + v2[i];
                continue;
            }
        } else if (v1.length > v2.length) {
            for (int i = 0; v1.length > i; i++) {
                if (v1.length < i) {
                    v3[i] = v1[i] + v2[i];
                } else {
                    v3[i] = v1[i];
                }
            }
        } else {
            for (int i = 0; v2.length > i; i++) {
                if (v2.length < i) {
                    v3[i] = v1[i] + v2[i];
                } else {
                    v3[i] = v2[i];
                }
            }
        }

        System.out.println("-----------------------------------------------");

        System.out.print("El número final es = ");

        for (int i = 0; v3.length > i; i++) {
            System.out.print(v3[i]);
        }
    }
}