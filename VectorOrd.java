/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adatarea4;
import java.util.Random;
public class VectorOrd {
    private int[] arreglo;
    
    public VectorOrd(int n) {
        this.arreglo = new int[n];
        llenarAleatoriamente();
    }

    private void llenarAleatoriamente() {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(100) + 1; //numeros random del 1 al 100
        }
    }

    public void mostrar() {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void ordenarMergeIterativo() {
        int n = arreglo.length;
        int[] temp = new int[n];
        int pasada = 1;

        for (int k = 1; k < n; k *= 2) {
            System.out.println("Pasada " + pasada + " (k = " + k + "):");

            for (int i = 0; i < n; i += 2 * k) {
                int inicio = i;
                int medio = Math.min(i + k, n);
                int fin = Math.min(i + 2 * k, n);
                fusionar(arreglo, temp, inicio, medio, fin);
            }
            
            System.arraycopy(temp, 0, arreglo, 0, n);
            mostrar();
            pasada++;
        }
    }
    
    private void fusionar(int[] origen, int[] destino, int inicio, int medio, int fin) {
        int i = inicio, j = medio, k = inicio;

        while (i < medio && j < fin) {
            if (origen[i] <= origen[j]) {
                destino[k++] = origen[i++];
            } else {
                destino[k++] = origen[j++];
            }
        }

        while (i < medio) {
            destino[k++] = origen[i++];
        }

        while (j < fin) {
            destino[k++] = origen[j++];
        }
    }
}
