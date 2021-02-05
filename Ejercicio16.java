import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduzca la cantidad de números que vas a introducidir: ");
            n = leer.nextInt();

            if (n < 0) {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (n < 0);

        int[] nEnteros = new int[n];
        int nMayor = 0;
        int nMenor = 0;

        for (int i = 0; nEnteros.length > i; i++) {
            System.out.print("Introduce el " + (i + 1) + "º número: ");
            nEnteros[i] = leer.nextInt();

            nMayor = nEnteros[0];
            nMenor = nEnteros[0];
        }

        for (int i = 0; nEnteros.length > i; i++) {
            if (nMayor < nEnteros[i]) {
                nMayor = nEnteros[i];
            }

            if (nMenor > nEnteros[i]) {
                nMenor = nEnteros[i];
            }
        }

        leer.close();

        System.out.println("El valor maximo es = " + nMayor);
        System.out.println("El valor minimo es = " + nMenor);
    }
}