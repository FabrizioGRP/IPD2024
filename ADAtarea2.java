/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adatarea2;
import java.util.*;
public class ADAtarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo (n): ");
        int n = sc.nextInt();

        GeneradorArreglo generador = new GeneradorArreglo(n);
        generador.mostrarArreglo();

        MaxSubconjunto maxSub = new MaxSubconjunto();
        maxSub.encontrarMaximaSuma(generador.getArreglo());
        maxSub.mostrarResultado(generador.getArreglo());
    }
    
}
