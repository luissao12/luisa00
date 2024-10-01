package pkg5vectores.j;

import java.util.Scanner;

public class J {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] alturas;
        alturas = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la altura de la persona: ");
            alturas[i] = sc.nextFloat();
        }
        float suma = 0, promedio = 0;
        for (int l = 0; l < 5; l++) {
            suma = suma + alturas[l];
        }
        System.out.println("La suma de las alturas es: " + suma);
        promedio = suma / 5;
        System.out.println("El promedio de las alturas es: " + promedio);
        int may, men;
        may = 0;
        men = 0;
        for (int l = 0; l < 5; l++) {
            if (alturas[l] > promedio) {
                may++;
            } else if (alturas[l] < promedio) {
                men++;
            }
        }
        System.out.println("La cantidad mayor del promedio es: " + may);
        System.out.println("La cantidad menor del promedio es: " + men);
    }

}
