/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adatarea2;
import java.util.*;
public class GeneradorArreglo {
    private final int n;
    private final ArrayList<Integer> arreglo;

    public GeneradorArreglo(int n) {
        this.n = n;
        this.arreglo = new ArrayList<>();
        generarArregloSinRepetidos();
    }

    private void generarArregloSinRepetidos() {
        Random random = new Random();
        Set<Integer> usados = new HashSet<>();

        while (arreglo.size() < n) {
            int numero = random.nextInt(401) - 200;
            if (!usados.contains(numero)) {
                usados.add(numero);
                arreglo.add(numero);
            }
        }
    }

    public ArrayList<Integer> getArreglo() {
        return arreglo;
    }

    public void mostrarArreglo() {
        System.out.println("Arreglo generado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
