/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adatarea2;
import java.util.*;
public class MaxSubconjunto {
    private int sumaMaxima;
    private int inicio;
    private int fin;

    public int encontrarMaximaSuma(ArrayList<Integer> arreglo) {
        int maxActual = 0;
        sumaMaxima = 0;
        int tempInicio = 0;

        for (int i = 0; i < arreglo.size(); i++) {
            maxActual += arreglo.get(i);

            if (maxActual < 0) {
                maxActual = 0;
                tempInicio = i + 1;
            } else if (maxActual > sumaMaxima) {
                sumaMaxima = maxActual;
                inicio = tempInicio;
                fin = i;
            }
        }

        return sumaMaxima;
    }

    public void mostrarResultado(ArrayList<Integer> arreglo) {
        System.out.println("\nSubarreglo con suma máxima:");
        if (sumaMaxima == 0) {
            System.out.println("[No hay subarreglo positivo]");
        } else {
            for (int i = inicio; i <= fin; i++) {
                System.out.print(arreglo.get(i) + " ");
            }
            System.out.println("\nSuma máxima: " + sumaMaxima);
        }

        System.out.println("\nFunción tiempo del algoritmo: T(n) = n");
        System.out.println("Notación asintótica: O(n)");
    }
}
