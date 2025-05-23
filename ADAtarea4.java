/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adatarea4;
import java.util.Scanner;
public class ADAtarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese la cantidad de elementos del vector (mayor a 2) ---> ");
            n = sc.nextInt();
        } while (n <= 2);

        VectorOrd vector = new VectorOrd(n);
        
        System.out.println("\nVector original:");
        vector.mostrar();

        System.out.println("\nIniciando ordenamiento Merge Sort iterativo...\n");
        vector.ordenarMergeIterativo();
    }
}
